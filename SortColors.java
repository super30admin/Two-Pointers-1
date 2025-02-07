// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach

public class SortColors {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int l = 0, mid = 0, r = n - 1;

        while (mid <= r) {
            if (nums[mid] == 2) {
                swap(nums, mid, r);
                r--;
            } else if (nums[mid] == 0) {
                swap(nums, l, mid);
                l++;
                mid++;
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
