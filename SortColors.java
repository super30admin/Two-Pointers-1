// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Approach

// Used the pointers approach
// took three pointers mid, low and high
// if mid was 0 swapped with low
// if mid was 2 swapped with high

class Solution {
    public void sortColors(int[] nums) {
        if (nums == null || nums.length == 0)
            return;

        int mid = 0, high = nums.length - 1, low = 0;

        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low, mid);
                mid++;
                low++;
            } else if (nums[mid] == 2) {
                swap(nums, mid, high);
                high--;
            } else {
                mid++;
            }
        }
    }

    private void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}