// In this using 3 pointers, left for 0s, right for 2s and mid for 1s. keep left and mid at 0 and right at n-1. Iterate through the 
// array, if 0 found, swap mid with left, increment left and mid. If 2 found, swap mid with right, decrement right. If 1 found, 
// do mid++.

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
    public void sortColors(int[] nums) {
        // Base Condition
        if (nums == null || nums.length == 0) {
            return;
        }
        // Three pointers for 0, 1, and 2
        int left = 0;
        int mid = 0;
        int right = nums.length - 1;
        // Run a loop till mid <=right
        while (mid <= right) {
            // If mid==2, swap mid with right
            if (nums[mid] == 2) {
                swap(nums, mid, right);
                // Decrement right
                right--;
            }
            // If mid==0, swap mid with left
            else if (nums[mid] == 0) {
                swap(nums, mid, left);
                // Increment mid and left
                mid++;
                left++;
            } else {
                // Else if it is 1, increment mid
                mid++;
            }
        }

    }

    // Swap function to swap mid with left/right
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}