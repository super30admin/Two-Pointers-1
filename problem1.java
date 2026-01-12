// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No, just need to handle mid pointer properly.


// Your code here along with comments explaining your approach in three sentences only
// I use three pointers low, mid, high to place 0s to the left and 2s to the right.
// If nums[mid] is 0, swap with low and move both; if it is 2, swap with high and move high only.
// If nums[mid] is 1, just move mid, and this finishes sorting in one pass.

class Solution {
    public void sortColors(int[] nums) {

        int low = 0, mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {

            if (nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            } 
            else if (nums[mid] == 2) {
                swap(nums, mid, high);
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
