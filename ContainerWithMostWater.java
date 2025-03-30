
//Time Complexity : O(n) where n is the number of elements in the height array.
// Space Complexity : O(1) as we are using only a few variables for calculations.
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// LeetCode: https://leetcode.com/problems/container-with-most-water/

/**
 * Uses a two-pointer approach to find the maximum area between vertical lines.
 * 1. Initialize two pointers at both ends and compute the area iteratively.
 * 2. Move the pointer pointing to the shorter height inward to maximize potential area.
 * 3. Track the maximum area found and return the final result.
 */


public class ContainerWithMostWater {
        public int maxArea(int[] height) {
            int maxArea = 0; 
            int start = 0; 
            int end = height.length-1; 
    
            while(start < end) {
                int h = Math.min(height[start], height[end]);
                int w = end-start; 
                maxArea = Math.max(maxArea, h*w);
    
                if(height[end] > height[start]) {
                    start++;
                }
                else {
                    end--;
                }
            }
            return maxArea;
        }
}
