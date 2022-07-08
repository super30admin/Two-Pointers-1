// Time Complexity :O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no

class Solution {
    public int maxArea(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }

        int left = 0; // left pointer
        int right = height.length - 1; // right pointer
        int max = 0;

        while (left < right) {
            int area = Math.min(height[left], height[right]) * (right - left); // container capacity
            max = Math.max(max, area);

            if (height[left] < height[right]) { // moving the pointer with less height.
                left++;
            } else if (height[right] < height[left]) { // moving the pointer with less height.
                right--;
            } else { // if the height of both pointer are same, move both.
                left++;
                right++;
            }
        }

        return max;

    }
}