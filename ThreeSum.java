//Time Complexity: O(n*n)
//Time Complexity: O(1)
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        int start = 0;
        while(start < nums.length - 2){
            int low = start+1;
            int high = nums.length-1;
            int target = 0-nums[start];
            while(low<high){
                if(nums[low]+nums[high]==target){
                    List<Integer> li = new ArrayList<>();
                    li.add(nums[start]);
                    li.add(nums[low]);
                    li.add(nums[high]);
                    list.add(li);
                    low++;
                    high--;
                    while(low<nums.length && nums[low]==nums[low-1]){
                        low++;
                    }
                    while(high<nums.length-1 && high>0 && nums[high]==nums[high+1]){
                        high--;
                    }
                }
                else if(nums[low]+nums[high]<target){
                    low++;
                }
                else{
                    high--;
                }

            }
            start++;
            while(start < nums.length && nums[start] == nums[start-1]) {
                start++;
            }

        }

        return list;
    }
}
