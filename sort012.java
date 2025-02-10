// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : N/A

// Your code here along with comments explaining your approach
// Used low, mid, high to keep track 0, 1, 2 respectively.

public class sort012 {
    public static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, mid, low);
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
}