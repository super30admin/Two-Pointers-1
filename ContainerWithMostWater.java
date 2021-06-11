// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

/**
 * In this problem, I have used two pointer approach to find the maximum area.
 * The minimum height of the start and end pointer is the deciding factor for area.
 */

class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        
        int start = 0;
        int end = height.length - 1;
        
        while(start < end) {
            
            max = Math.max(max, (end-start) * Math.min(height[start], height[end]));
            
            if (height[start] > height[end]) {
                end--;
            } else if(height[start] < height[end]) {
                start++;
            } else {
                // height[start] == height[end]
                start++;
                end--;
            }
        }
        return max;
    }
}