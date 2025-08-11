## Problem3 (https://leetcode.com/problems/container-with-most-water/)
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

class Solution {
    public int maxArea(int[] height) {
         int left = 0;                      // pointer at the start
         int right = height.length - 1;     // pointer at the end
         
         int maxWater = 0;                  // store the maximum water area found
         
         // Two-pointer approach
         while (left < right) {
            int minHeight = Math.min(height[left], height[right]);
            int width = right - left;
            // Area = min height × width
            int limit = minHeight * width;
            // Update maxWater if we found a bigger area
            if (limit > maxWater)
                maxWater = limit;
            // Move the pointer 
            if (height[left] < height[right])
                left++;
            else 
                right--;
         }
         return maxWater;  // return the largest area found
    }
}
