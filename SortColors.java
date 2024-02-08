// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
// Maintain 3 pointers for where the red, white or blue indexes.
// Move respective pointers as you encounter the respective balls.

class SortColors {
    public void sortColors(int[] nums) {
        // these indexes are maintaing where the next respective color
        // should be swapped
        int red = 0;
        int white = 0;
        int blue = nums.length - 1;

        while (white <= blue) {
            if (nums[white] == 0) {
                swap(nums, white, red);
                red++;
                white++;
            } else if (nums[white] == 1) {
                white++;
            } else {
                swap(nums, white, blue);
                blue--;
            }
        }
    }

    public void swap(int[] nums, int color1, int color2) {
        int temp = nums[color1];
        nums[color1] = nums[color2];
        nums[color2] = temp;
    }
}