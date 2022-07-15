// Time Complexity :O(n) where n is no of elements
// Space Complexity :constant
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No


class Solution {
    public int maxArea(int[] height) {
        if (height == null || height.length == 0)
            return 0;

        int ptr1 = 0;
        int ptr2 = height.length - 1;
        int maxArea = 0;
        while (ptr1 < ptr2) {
            int area = (ptr2 - ptr1) * Math.min(height[ptr1], height[ptr2]);
            maxArea = Math.max(maxArea, area);
            if (height[ptr1] < height[ptr2]) {
                ptr1++;
            } else {
                ptr2--;
            }

        }
        return maxArea;
    }
}