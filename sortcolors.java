// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :

class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;
        while (mid <= high) {
            // if value is 1 increase mid only
            if (nums[mid] == 1) {
                mid++;
            }
            // if value 0 swap values in low and mid and increment both
            else if (nums[mid] == 0) {
                swap(nums, low, mid);
                mid++;
                low++;
            } else {
                swap(nums, high, mid);
                high--;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}