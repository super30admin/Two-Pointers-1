// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// logic: First, we sort the array to make it easier to avoid duplicates and use the two-pointer technique.
//Iterate with Three Pointers: We use a fixed pointer i and two other pointers (left and right) to find triplets that sum to zero.
// For each i, we check the sum of nums[i], nums[left], and nums[right] and adjust the pointers accordingly to find all valid triplets.
//Avoid Duplicates: Skip duplicates for both the fixed pointer and the two-pointer positions to ensure each triplet is unique.

import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new ArrayList<>();
        }

        Arrays.sort(nums);  // Step 1: Sort the array
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {  // Skip duplicate values for the fixed pointer
                continue;
            }
            if (nums[i] > 0) {  // If the current value is greater than 0, break because remaining values can't sum to 0
                break;
            }
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];  // Calculate the sum of the triplet
                if (sum == 0) {  // If the sum is zero, we found a valid triplet
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    // Skip duplicates for the left pointer
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                    // Skip duplicates for the right pointer
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                } else if (sum < 0) {  // If the sum is less than zero, move the left pointer to the right
                    left++;
                } else {  // If the sum is greater than zero, move the right pointer to the left
                    right--;
                }
            }
        }

        return result;  // Return the list of unique triplets
    }
}
