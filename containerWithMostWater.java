/**
Problem: https://leetcode.com/problems/container-with-most-water/
TC: O(n)
SC: O(1)
*/
class Solution {
    public int maxArea(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }
        
        int left = 0, right = height.length - 1;
        int maxWater = 0;
        
        while(left < right) {
            int curWater = (right - left) * Math.min(height[left], height[right]);
            maxWater = Math.max(maxWater, curWater);
            
            if (height[left] >= height[right]) {
                --right;    
            } else {
                ++left;
            }
        }
        
        return maxWater;
    }
}