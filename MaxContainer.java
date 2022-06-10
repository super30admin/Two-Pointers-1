// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this :

class Solution {
    public int maxArea(int[] height) {

        int maxArea = Integer.MIN_VALUE;

        // Finalize the max width
        // we need to get Max Height between two poles that will increase the area
        int i = 0;
        int j = height.length - 1;

        while (i < j) {
            int width = j - i;
            int h = Math.min(height[i], height[j]);
            int area = width * h;

            maxArea = Math.max(maxArea, area);

            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }

        }

        return maxArea;
    }
}