// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : No

class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1, maxArea = 0;
        while (left < right) {
            int width = right - left;
            maxArea = Math.max(maxArea, Math.abs(right - left) * Math.min(height[left], height[right]));
            if (height[left] > height[right]) right--;
            else left++;
        }
        return maxArea;
    }
}