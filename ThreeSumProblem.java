// Time Complexity : O(nlogn) + O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ThreeSumProblem {

    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        int target = 0;

        Arrays.sort(nums);
        for(int i=0; i<nums.length-2; i++)
        {
            int low = i+1;
            int high = nums.length-1;
            if(i!=0 && nums[i] == nums[i-1]) continue;
            if(nums[i] > target)break;
            while(low < high) {
                int sum = nums[i] + nums[low] + nums[high];
                if (sum == target) {
                    result.add(Arrays.asList(nums[i], nums[low], nums[high]));
                    low++;
                    high--;
                    while(low < high && nums[low] == nums[low-1])
                    {
                        low++;
                    }
                    /*while(low < high && nums[high] == nums[high+1])
                    {
                        high--;
                    }*/
                } else if (sum < target) {
                    low++;
                } else {
                    high--;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4,-2,-3,3,0,4};
        //{-4,-3,-2,-1,-1,0,0,1,2,3,4,4};
         System.out.println(threeSum(nums));
    }
}
