/**
 * Q: https://leetcode.com/problems/container-with-most-water/
 * 
 * Approach : Take two pointers, one in the start and one in the end. 
 * In each iteration of loop calculate the area by uisng the lower height and
 * distance between left and right pointer and check if its the max area. 
 * Move the left and right pointer depending on whose hieght is larger. 
 * 
 * Time Complexity : O(n) Space Complexity : O(1)
 * 
 */

class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0, l = 0, r = height.length - 1;

        while (l < r) {
            int lowerHeight = Math.min(height[l], height[r]);
            maxArea = Math.max(maxArea, lowerHeight * (r - l));

            if (height[l] < height[r])
                l++;
            else
                r--;
        }
        return maxArea;
    }

}