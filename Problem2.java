/*
Time Complexity:-O(n^2)
Space Complexity:-O(1)
Approach:-Sort the array to allow efficient duplicate skipping and two-pointer search. Fix one number nums[i] and use two pointers (left and right) to find a pair such that nums[i] + nums[left] + nums[right] == 0.
Skip duplicates for both the fixed element and the two-pointer elements.*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Problem2 {
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