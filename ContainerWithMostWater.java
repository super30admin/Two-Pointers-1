// Time Complexity : O(n) --> where n is length of input array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode (11): Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public int maxArea(int[] height) {
        if (height == null || height.length == 0) return 0;
        int n = height.length;
        int currArea = 0;
        int maxArea = 0;
        int low = 0;
        int high = n - 1;
        
        while (low < high) {
            // area = width * height
            currArea = (high - low) * Math.min(height[low], height[high]);
            maxArea = Math.max(maxArea, currArea);
            if (height[low] < height[high]) low++;
            else high--;
        }     
        return maxArea;
    }
}