// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/*
 * Used 2 pointer approach to find the max_area that can be formed between two heights
 * Area between two indexes = (Difference in index * min_height of the two pillars)
 */

class Solution {
    public int maxArea(int[] height) {
        
        int max_area = 0;
        
        int start = 0;
        int end = height.length - 1;
        
        
        while (start < end) {
            
            int currArea = (end - start) * Math.min(height[start], height[end]);
            
            max_area = Math.max(max_area, currArea);
            
            if (height[start] <= height[end]) {
                start++;
            } else {
                end--;
            }
        }
        
        return max_area;
    }
}