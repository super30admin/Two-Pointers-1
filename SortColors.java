/**
 * @author Vishal Puri
 * // Time Complexity : O(n)
 * // Space Complexity : O(1)
 * // Did this code successfully run on Leetcode : Yes
 * // Any problem you faced while coding this :
 */

public class SortColors {
    public void sortColors(int[] nums) {
        if (nums == null || nums.length == 0) return;
        int zero = 0, two = nums.length - 1, i = 0;
        while (i <= two) {
            if (nums[i] == 0) {
                swap(nums, i, zero);
                i++;
                zero++;
            } else if (nums[i] == 1) {
                i++;
            } else {
                swap(nums, i, two);
                two--;
            }
        }
    }

    private void swap(int[] nums, int s, int e) {
        int temp = nums[s];
        nums[s] = nums[e];
        nums[e] = temp;
    }
}
