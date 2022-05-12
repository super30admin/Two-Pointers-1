// Time Complexity :O(n)
// Space Complexity :constant
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No

//using three pointers, left right and mid. left represents 0s mid 1s and right 2s. if we encounter 2 at mid,we
//swap mid with right and dec right ptr. if we encounter 0, we swap with left and inc both left and mid
class Solution {
    public void sortColors(int[] nums) {

        if (nums == null || nums.length == 0) {
            return;
        }
        int left = 0;
        int mid = 0;
        int right = nums.length - 1;
        while (mid <= right) {
            if (nums[mid] == 2) {
                swap(nums, mid, right);
                right--;
            } else if (nums[mid] == 0) {
                swap(nums, mid, left);
                mid++;
                left++;
            } else {
                mid++;
            }
        }
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}