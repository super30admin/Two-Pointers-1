// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public int maxArea(int[] height) {

        int l = 0;
        int h = height.length - 1;
        int max = 0;

        while (l < h) {
            int current = (h - l) * Math.min(height[l], height[h]);
            max = Math.max(max, current);

            if (height[l] < height[h]) {
                l++;
            } else {
                h--;
            }
        }
        return max;
    }
}