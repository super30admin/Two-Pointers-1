// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Had to revise basic syntax

// Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
// We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
// You must solve this problem without using the library's sort function.

// Example 1:
// Input: nums = [2,0,2,1,1,0]
// Output: [0,0,1,1,2,2]

// Example 2:
// Input: nums = [2,0,1]
// Output: [0,1,2]

// Constraints:
// n == nums.length
// 1 <= n <= 300
// nums[i] is either 0, 1, or 2.
 
// Follow up: Could you come up with a one-pass algorithm using only constant extra space?

class Solution {
    public void sortColors(int[] nums) {
        // Base Case: input array is empty or null
        if (nums == null || nums.length == 0){
            return;
        }

        int left = 0; // left boundary for 0s
        int curr = 0; // current pointer
        int right = nums.length - 1; // right boundary fpr 2s

        // processing elements until curr crosses right
        while (curr <= right){
            if (nums[curr] == 2){
                // swapping current 2 to the right side and shrinking right boundary
                swap(nums, curr, right);
                right--;
            }
            else if (nums[curr] == 1){
                // leaving 1 in place and move forward
                curr++;
            }
            else {
                // if nums[curr] == 0, swapping current 0 to the left side and expanding left boundary
                swap(nums, curr, left);
                left++;
                curr++; // moving curr because left side is finalized
            }
        }
    }

    // helper method to sway elements at two indices
    private void swap(int[] nums, int p1, int p2){
        int temp = nums[p1];
        nums[p1] = nums[p2];
        nums[p2] = temp;
    }
}