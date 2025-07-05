/*75. Sort Colors
Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
You must solve this problem without using the library's sort function.
Example 1:
Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
Constraints:
n == nums.length
1 <= n <= 300
nums[i] is either 0, 1, or 2.

Follow up: Could you come up with a one-pass algorithm using only constant extra space?
*/
/*
Time Complexity:-O(n)
Space Complexity:-O(1)
Approach:- Dutch National Flag algorithm
We need to sort an array containing only 0s, 1s, and 2s in-place.
Use 3 pointers:
left → position to place next 0
right → position to place next 2
mid → current element being examined
Move through the array once, swapping 0s to the front and 2s to the back.
*/
class SortColors {
    public void sortColors(int[] nums) {
        // Edge case: empty array
        if (nums == null || nums.length == 0) {
            return;
        }
        int n = nums.length;
        int left = 0;// Pointer to place 0s
        int right = n - 1; // Pointer to place 2s
        int mid = 0; // Current index being checked
        // Process elements until mid crosses right
        while (mid <= right) {
            if (nums[mid] == 2) {
                // Swap current 2 with element at right pointer
                swap(nums, mid, right);
                right--;// shrink right boundary
                // Don't move mid here because swapped value needs re-check
            } else if (nums[mid] == 0) {
                // Swap current 0 with element at left pointer
                swap(nums, mid, left);
                left++; // shrink left boundary
                mid++; // move to next element
            } else {
                mid++;// Skip 1s
            }
        }
    }

    // Swap helper function
    private void swap(int[] nums, int l, int r) {
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }
}