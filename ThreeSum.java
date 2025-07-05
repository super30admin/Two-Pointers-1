/* 15. 3Sum
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
Notice that the solution set must not contain duplicate triplets.
Example 1:
Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Explanation: 
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order of the triplets does not matter.
Constraints:
3 <= nums.length <= 3000
-105 <= nums[i] <= 105

/*
Time Complexity:-O(n^2)
Space Complexity:-O(1)
Approach:-Sort the array to allow efficient duplicate skipping and two-pointer search.
Fix one number nums[i] and use two pointers (left and right) to find a pair such that nums[i] + nums[left] + nums[right] == 0.
Skip duplicates for both the fixed element and the two-pointer elements.*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        // Edge case: if less than 3 elements, no triplets possible
        if (nums == null || nums.length < 3)
            return new ArrayList<>();

        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums); // Step 1: sort the array
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            // If current number > 0, break early (since all following are positive)
            if (nums[i] > 0)
                break;
            // Skip duplicate values for i
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            int left = i + 1; // Pointer just after i
            int right = n - 1; // Pointer at the end
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    // Found a valid triplet
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    // Skip duplicate values after finding a valid triplet
                    while (left < right && nums[left] == nums[left - 1])
                        left++;
                    while (left < right && nums[right] == nums[right + 1])
                        right--;
                } else if (sum > 0) {
                    right--; // Sum too big, move right pointer left
                } else {
                    left++; // Sum too small, move left pointer right
                }
            }
        }
        return result;
    }
}
