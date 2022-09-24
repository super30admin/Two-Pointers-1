// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :
class Solution {
    public void sortColors(int[] nums) {
        // base case
        if (nums == null || nums.length == 0) return;

        int n = nums.length;
        int low = 0;
        int high = n - 1;
        int mid = 0;

        while (mid <= high) {
            if (nums[mid] == 2) {
                swap(nums, mid, high);
                high--;
            } else if (nums[mid] == 0) {
                swap(nums, mid, low);
                low++;
                mid++;
            } else {
                mid++;
            }
        }
    }

    private void swap(int[] nums, int mid, int var) {
        int temp = nums[var];
        nums[var] = nums[mid];
        nums[mid] = temp;
    }
}