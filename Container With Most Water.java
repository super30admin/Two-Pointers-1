// TC = O(n)
// SC = O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
    public int maxArea(int[] height) {
        // TC = O(n), SC = O(1)
        if(height == null || height.length == 0) return 0;
        int area = 0, left = 0, right = height.length - 1;
        while(left < right) {
            int currArea = Math.min(height[left], height[right]) * (right - left); // currentArea = height * width
            area = Math.max(currArea, area);
            if(height[left] <= height[right]) left++;
            else right--;
        }
        return area;
    }
}