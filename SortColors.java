//https://leetcode.com/problems/sort-colors/
/*
Time: O(n) where n=nums.length
Space: O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : None
*/
public class SortColors {

    public static void sortColors(int[] nums) {
        if (nums == null || nums.length == 0)
            return;

        int low = 0, mid = 0, high = nums.length - 1;

        while (mid <= high) {

            if (nums[mid] == 0) {
                swap(nums, low++, mid++);

            } else if (nums[mid] == 1) {
                mid++;

            } else {
                swap(nums, mid, high--);
            }
        }
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
