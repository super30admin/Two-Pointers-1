/*
Dutch National Flag Problem
Time Complexity : O(n)
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No
*/

public class SortColors {
    public void sortColors(int[] nums) {
        if (nums == null || nums.length == 0)
            return;

        int low = 0, mid = 0, high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 2) {
                swap(nums, mid, high);
                high--;
            } else if (nums[mid] == 0) {
                swap(nums, mid, low);
                low++;
                // mid++;
            } else {
                mid++;
            }
        }
    }

    public void swap(int[] nums, int mid, int index) {
        int temp = nums[mid];
        nums[mid] = nums[index];
        nums[index] = temp;
        return;
    }
}
