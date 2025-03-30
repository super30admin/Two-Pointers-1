
import java.util.*; 

//Time Complexity : O(n log n) for sorting + O(n^2) for the two-pointer search
// Space Complexity : O(1) for the sorting + O(k) for the result list, where k is the number of triplets found
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

/**
 * Finds all unique triplets in the array that sum up to zero.
 * 1. Sort the array to facilitate two-pointer traversal.
 * 2. Iterate through the array, using a two-pointer approach to find pairs summing to the negative of the current element.
 * 3. Skip duplicate elements to ensure unique triplets in the result.
 */

// LeetCode: https://leetcode.com/problems/3sum/

public class ThreeSum {
    
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(nums.length < 3) return result;
        Arrays.sort(nums);
        int n = nums.length;
        for(int i = 0 ; i < n-2 && nums[i] <= 0  ; i++) {
            if(i != 0 && nums[i] == nums[i-1]) continue;

            twoSum(nums, -nums[i], i+1, result);
        }
        return result;
    }

    public void twoSum(int[] nums, int target, int start, List<List<Integer>> result) {
        int end = nums.length-1;

        while(start < end) {
            int sum = nums[start] + nums[end];

            if(sum == target) {
                result.add(Arrays.asList(nums[start], -target, nums[end]));
                start++;
                end--;
                while(start < end && nums[start] == nums[start-1]) {
                    start++;
                }
            }

            else if(sum > target) {
                end--;
            }
            else {
                start++;
            }
        }
    }
    
}
