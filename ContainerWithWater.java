// Approach: Two pointer
// Time: O(N)
// Space: O(1)

/**
 * Water can be held between the area of 2 pillar. Taller and father pillars form container with maximum area.
 * Start with the first and last pillar and iterate by keeping the taller pillar
 * and moving the index at smaller pillar.
 * Calculate the area for each iteration and keep the max area.
 **/ 
class Solution {
    public int maxArea(int[] height) {
        int area = 0;
        int p1 = 0;
        int p2 = height.length - 1;
        while (p1 < p2) {
            int possibleHeight = Math.min(height[p1], height[p2]); // Water can be held until the min height
            area = Math.max(area, possibleHeight * (p2 - p1)); // Calculate max possible area
            // Move the index at smaller height
            if (height[p1] > height[p2]) {
                p2 --;
            } else {
                p1 ++;
            }
        }
        return area;
    }
}