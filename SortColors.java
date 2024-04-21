// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : I had to go through lecture.

/*
 * Three colors ; 3 pointers 
 * 
 * Left - collects 0 
 * mid - collects 1
 * Right - collects 2
 * 
 * we start mid and left from 0 index 
 * 1. if we find a color-2 we swap with right and decrement RIght
 * 2. If we find a color-0 at mid then we swap  mid with whats at the left and move on left++ & mid++
 * 3. if we find a color-1 just move forward
 * 
 * 
 */
public class SortColors {

    public void sortColors(int[] nums) {
        int left = 0;
        int mid = 0;
        int right = nums.length - 1;

        while (mid <= right) {

            if (nums[mid] == 2) {
                swap(nums, mid, right);
                right--;
            } else if (nums[mid] == 0) {
                swap(nums, mid, left);
                left++;
                mid++;
            } else {
                mid++;
            }

        }
    }

    private void swap(int[] nums, int x, int y) {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
}