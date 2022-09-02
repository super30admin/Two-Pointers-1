// Time complexity: O(n^2)
// Space complexity: O(1)

// Approach: Brute force approach where we calculate the area between each index with rest of indexes. Area = w * h. Height should be the mininum height between two indexed and the width is the 2nd index minus the first

class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        
        for (int i = 0; i < height.length-1; i++) {
            for (int j = i+1; j < height.length; j++) {
                int area = Math.min(height[i], height[j]) * (j-i);
                max = Math.max(max, area);
            }
        }
        
        return max;
    }
}