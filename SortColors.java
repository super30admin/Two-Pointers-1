// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
    public void sortColors(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }

        int low = 0;
        int high = nums.length - 1;
        int mid = 0;

        while (mid <= high) {
            if (nums[mid] == 0) { // (low, mid, high)
                swap(nums, low, mid); // (0,1,2) This is the pattern.
                low++;
                mid++;
            } else if (nums[mid] == 1) { // mid is in the right position
                mid++;
            } else {
                swap(nums, high, mid);
                high--;
            }
        }
    }

    private void swap(int nums[], int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

    }
}