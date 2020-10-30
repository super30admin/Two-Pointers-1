// Time Complexity : O(n^2) where  n is size of the input array
// Space Complexity : O(1) not extra auxiliary space used
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/*Approach
 * We will be using two pointers approach. We can solve it with brute force with but time complexity is (On^3). With two pointers
 * we can sort the array and use the low and high pointer to eliminate one nested operation, reducing the
 * time complexity to O(n^2)*/


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    //brute force approach
    /*public List<List<Integer>> threeSum(int[] nums) {
        //edge
        if(nums==null || nums.length<2) return new ArrayList<>();

        Set<List<Integer>> set = new HashSet<>();

        //brute for solution
        for(int i=0; i<nums.length-2; i++){
            for(int j=i+1; j<nums.length-1; j++){
                for(int k=j+1; k<nums.length; k++){
                    if(nums[i] + nums[j] + nums[k] == 0){
                        List<Integer> list = Arrays.asList(nums[i],nums[j],nums[k]);
                        Collections.sort(list);
                        set.add(list);
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }*/

    public List<List<Integer>> threeSum(int[] nums){
        //edge
        if(nums==null || nums.length<0) return new ArrayList<>();

        List<List<Integer>> result = new ArrayList<>();
        //sort the input array
        Arrays.sort(nums);
        for(int i=0; i<nums.length-2; i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            int low = i+1;
            int high=nums.length-1;
            while(low<high){
                int sum = nums[i] + nums[low] +nums[high];
                if(sum == 0){
                    List<Integer> list = Arrays.asList(nums[i], nums[low], nums[high]);
                    result.add(list);
                    low++; high--;
                    while (low<high && nums[low]==nums[low-1]){
                        low++;
                    }
                    while (low<high && nums[high]==nums[high+1]){
                        high--;
                    }
                }
                else if(sum < 0){
                    low++;
                }
                else {
                    high--;
                }
            }
        }
        return result;
    }

}
