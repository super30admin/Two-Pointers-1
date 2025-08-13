// Time Complexity : O(n)  // Single pass through the array
// Space Complexity : O(1) // In-place swaps, no extra data structures
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Approach :
// 1. Use three pointers: low (next position for 0), mid (current element), high (next position for 2).
// 2. If nums[mid] == 0, swap with nums[low] and increment both low and mid. ( representing red)
// 3. If nums[mid] == 2, swap with nums[high] and decrement high (don't increment mid yet). (representing blue)
// 4. If nums[mid] == 1, just increment mid. (representing white)

import java.util.*;

public class SortColors {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int low = 0, mid = 0, high = n - 1;

        while (mid <= high) {
            if (nums[mid] == 2) {
                swap(nums, mid, high);
                high--; // shrink the region for 2's
            }
            else if (nums[mid] == 0) {
                swap(nums, mid, low);
                low++;
                mid++; // move both forward after placing a 0
            }
            else {
                mid++; // nums[mid] == 1, leave it and move on
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
