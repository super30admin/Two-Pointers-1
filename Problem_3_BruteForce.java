// Time complexity - O(n^2)
// Space complexity - O(1)

// Brute force approach. Calculate area between each possible hights and return max.

class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        for(int i = 0; i < height.length-1;i++){
            for(int j =i + 1; j < height.length;j++){
                int diff = j-i;
                int h = Math.min(height[i],height[j]);
                int area = diff * h;
                max = Math.max(max,area);
            }
        }
        return max;
    }
}
