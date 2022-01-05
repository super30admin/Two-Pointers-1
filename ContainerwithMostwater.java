// Time Complexity :  o(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

class Solution {
    public int maxArea(int[] height) {
        int maxarea = 0, lo = 0, hi = height.length - 1;
        while(lo <  hi){
            maxarea = Math.max(maxarea, Math.min(height[lo],height[hi]) * (hi - lo));
            
            if(height[lo] < height[hi])
                lo++;
            else
                hi--;
        }
        
        return maxarea;
    }
}