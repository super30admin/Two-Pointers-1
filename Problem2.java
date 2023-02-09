import java.util.HashSet;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;


/*
3Sum
approach: multiple
best approach: using 2 pointers
best time: O(nxn)
best space: O(1)
 */
public class Problem2 {
    static List<List<Integer>> twoSum(int[] nums, int target, int index) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<List<Integer>> pairs = new HashSet<>();

        for(int i=index+1;i<nums.length;i++) {

            if(set.contains(target-nums[i])){
                List<Integer> li = Arrays.asList(nums[i], target-nums[i]);
                Collections.sort(li);
                pairs.add(li);
            }
            else{
                set.add(nums[i]);
            }

        }

        return  new ArrayList<>(pairs);
    }

    static List<List<Integer>> threeSumUsingHashing(int[] nums) {
        int n = nums.length;
        HashSet<List<Integer>> result = new HashSet<>();

        for(int i=0;i<nums.length;i++) {

            List<List<Integer>> pairs = twoSum(nums, 0-nums[i], i);

            for(List<Integer> pair: pairs){
                List<Integer> li = Arrays.asList(nums[i], pair.get(0), pair.get(1));
                Collections.sort(li);
                result.add(li);
            }
        }

        return new ArrayList<>(result);
    }

    static List<List<Integer>> twoSumUsing2Pointers(int[] nums, int target, int index) {
        List<List<Integer>> result = new ArrayList<>();
        int l=index, h=nums.length-1;
        while(l<h) {
            if(target==nums[l]+nums[h]) {
                List<Integer> li = Arrays.asList(nums[index-1], nums[l],nums[h]);
                result.add(li);
                l++;
                h--;
                while(l<h && nums[l]==nums[l-1]) l++;
                while(l<h && nums[h]==nums[h+1]) h--;
            }
            else if(target>nums[l]+nums[h]) l++;
            else h--;
        }

        return  result;
    }


    static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){

            if(i!=0 && nums[i]==nums[i-1]) continue;
            result.addAll(twoSumUsing2Pointers(nums, 0-nums[i], i+1));
        }
        return result;
    }



    public static void main(String []args) {
        System.out.print(threeSum(new int[]{-1,0,1,2,-1,-4}));
    }
}
