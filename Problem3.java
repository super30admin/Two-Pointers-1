// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        
        int maxArea = 0;
        
        while (left < right) {
            int area = (right - left) * Math.min(
                height[left], 
                height[right]
            );
            maxArea = Math.max(maxArea, area);
            
            if (height[left] <= height[right]) {
                left++;
            }
            else {
                right--;
            }
        }
        return maxArea;
    }
}
