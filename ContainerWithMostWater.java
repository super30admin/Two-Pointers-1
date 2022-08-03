// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
// 1 Two pointer approach

//11. Container With Most Water (Medium) - https://leetcode.com/problems/container-with-most-water/
class Solution {
    public int maxArea(int[] height) {
        int max = 0, low = 0, high = height.length-1;
        
        while (low < high) {
            int currArea = (high-low) * Math.min(height[low], height[high]);
            max = Math.max(max, currArea);
            
            if (height[low] < height[high]) low++;
            else high--;
        }
        
        return max;
    }
}