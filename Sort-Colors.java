// Approach:
// Count the occurrences of 0s, 1s, and 2s using three counters.
// Then overwrite the array by placing the counted number of 0s, 1s, and 2s sequentially.
// This is also known as the Counting Sort approach for this specific case.
//
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public void sortColors(int[] nums) {
        int red = 0;    // Count of 0s
        int blue = 0;   // Count of 1s
        int white = 0;  // Count of 2s

        // Count occurrences of each color
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                red++;
            else if (nums[i] == 1)
                blue++;
            else
                white++;
        }

        int i = 0;

        // Overwrite array with 0s
        while (red > 0) {
            nums[i++] = 0;
            red--;
        }

        // Overwrite array with 1s
        while (blue > 0) {
            nums[i++] = 1;
            blue--;
        }

        // Overwrite array with 2s
        while (white > 0) {
            nums[i++] = 2;
            white--;
        }
    }
}
