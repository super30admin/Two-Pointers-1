// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// find maximum area between to extreme pointers and moving the pointers inward based on the
// heights at the left and right pointers.

class MaxArea {
    public int maxArea(int[] height) {
        int len = height.length;

        if (len < 2 || height == null) {
            return 0;
        }
        int l = 0, r = len - 1;
        int maxArea = 0;

        while (l < r) {
            int currArea = Math.min(height[l], height[r]) * (r - l);
            maxArea = Math.max(maxArea, currArea);

            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }
        return maxArea;
    }
}