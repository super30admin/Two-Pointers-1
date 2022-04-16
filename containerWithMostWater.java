// Time Complexity : o(n2)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : yes ( time limit exceeded)
// Any problem you faced while coding this : no

//brute force approach where we check each iteration for min of two heights and multiply with distance apart

// Your code here along with comments explaining your approach
class Solution {
    public int maxArea(int[] height) {
        if(height == null || height.length == 0) {
            return 0;
        }
        int maxWater = 0;
        for(int i = 0; i < height.length; i++) {
            for(int j = 1; j < height.length; j++) {
               maxWater = Math.max(maxWater, Math.min(height[i], height[j]) * (j - i)); 
            }
        }
        return maxWater;
    }
}