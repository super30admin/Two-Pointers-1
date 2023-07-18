// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach

class Solution {
    public int maxArea(int[] height) {
        // Declaring variable max which is the output that we will return. Declaring two
        // pinters low and high
        int max = 0;
        int l = 0;
        int h = height.length - 1;

        // Edge case if there is no line or only one line
        if (h < 1) {
            return max;
        }

        // Loop will run till low is less than high. Incremeent low or high depending on
        // which line is lower. Also calculate max while doing that
        while (l < h) {
            max = Math.max(max, (Math.min(height[l], height[h])) * (h - l));
            if (height[l] < height[h]) {
                l++;
            } else {
                h--;
            }
        }
        return max;
    }
}