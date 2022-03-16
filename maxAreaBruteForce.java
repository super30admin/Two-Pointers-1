/**
 * time complexity is O(n^2)
 * space complexity is O(1)
 * 
 * time limit exceeds on leetcode
 */
class Solution {
    public int maxArea(int[] height) {
        
        int len = height.length;
        int max = 0;
        for(int i = 0; i < len; i++) {
            for(int j = i+1; j < len; j++) {
                int area = (j-i)*Math.min(height[i], height[j]);
                max = Math.max(max, area);
            }
        }
        return max;
    }
}