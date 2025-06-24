// Time Complexity : O(n), where n is the number of elements in the array
// Space Complexity : O(1), as we sort the array in-place without using extra space
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach:
// This problem is solved using the Dutch National Flag Algorithm.
// We use three pointers:
// - `low`: to place 0s
// - `mid`: to traverse the array //track 1
// - `high`: to place 2s
// We swap elements as needed to group all 0s at the beginning, 1s in the middle, and 2s at the end.

class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int low = 0;         // Pointer for next position of 0
        int mid = 0;         // Pointer to traverse the array //track 1
        int high = n - 1;    // Pointer for next position of 2

        // Continue processing until mid passes high
        while (mid <= high) {
            if (nums[mid] == 2) {
                // Swap current with high and move high pointer left
                swap(nums, mid, high);
                high--;
            } else if (nums[mid] == 0) {
                // Swap current with low and move both low and mid pointers right
                swap(nums, mid, low);
                low++;
                mid++;
            } else {
                // If element is 1, just move mid
                mid++;
            }
        }
    }

    // Helper function to swap two elements in the array
    private void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
