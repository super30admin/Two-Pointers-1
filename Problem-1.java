// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// We use 3 pointers, one color for each pointer (left for 0; mid for 1; right for 2)
// Whenever we find that color with the mid, we swap with left/right or keep it as is.
// Incrementing left and mid, while decrementing right till we complete the iterations
class Solution1 {
    public void sortColors(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }

        int n = nums.length;
        int left = 0, right = n - 1, mid = 0;

        while (mid <= right) {
            if (nums[mid] == 0) {
                // swap mid and left
                swap(nums, mid, left);
                left++;
                mid++;
            } else if (nums[mid] == 2) {
                // swap mid and right
                swap(nums, mid, right);
                right--;
            } else {
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