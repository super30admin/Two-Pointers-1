// Sort Colors
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Approach
// consider 3 pointers(low, mid, high) and point the low and mid to the starting index
// when mid pointer points to 0, swap it with low pointer & increment both the pointers.
// when mid pointer points to 2, swap it with high pointer & decerement high pointer.
// when mid pointer points to 1, just increment mid pointer.


class Solution {
    public void sortColors(int[] nums) {
        if(nums == null || nums.length == 0)
            return;

        int low = 0;
        int high = nums.length - 1;
        int mid = 0;

        while(mid <= high) {
            if(nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            }
            else if(nums[mid] == 2) {
                swap(nums, high, mid);
                high--;
            }
            else {
                mid++;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}