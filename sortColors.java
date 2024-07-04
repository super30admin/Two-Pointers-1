// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    // Swap function to exchange elements at indices left and right in the array nums
    private void swap(int left, int right, int[] nums) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }

    public void sortColors(int[] nums) {
        // Initialize pointers
        int left = 0;     // Pointer for the next position of 0
        int mid = 0;      // Pointer for the current element
        int right = nums.length - 1;  // Pointer for the next position of 2

        // Iterate through the array
        while (mid <= right) {
            if (nums[mid] == 0) {
                // If the current element is 0, swap it with the element at the left pointer
                swap(left, mid, nums);
                left++;   // Move the left pointer to the right
                mid++;    // Move the mid pointer to the right
            } else if (nums[mid] == 2) {
                // If the current element is 2, swap it with the element at the right pointer
                swap(right, mid, nums);
                right--;  // Move the right pointer to the left
                // Note: mid is not incremented here because we need to re-evaluate the swapped element
            } else {
                // If the current element is 1, just move the mid pointer to the right
                mid++;
            }
        }
    }
}
