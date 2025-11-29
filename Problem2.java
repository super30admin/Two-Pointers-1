// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
I first sort the array and fix one number, then use two pointers to find the remaining two numbers that sum to zero.
For each fixed number, I move the left and right pointers based on whether the current sum is too small or too large.
Whenever I find a valid triplet, I add it to the result and skip duplicates to avoid repeating the same combinations.
*/



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem2 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if(nums.length < 3) {
            return res;
        }

        Arrays.sort(nums);
        for(int i = 0;i<nums.length;i++) {
            if(i == 0 || nums[i] != nums[i-1]) {
                helper(nums, res, i);
            }
        }

        return res;
    }

    private void helper(int[] nums, List<List<Integer>> res, int i) {
        int j = i+1;
        int k = nums.length - 1;

        while(j < k) {
            int sum = nums[i] + nums[j] + nums[k];
            if(sum == 0) {
                res.add(new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[k])));
                j++;
                k--;
                while(j<k && nums[j] == nums[j-1]) {
                    j++;
                }
            } else if(sum > 0) {
                k--;
            } else {
                j++;
            }
        }
    }
}
