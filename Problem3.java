// Time Complexity : 
//      maxArea() - O(n*n)
//      
// Space Complexity :
//      maxArea() - O(1)
//
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public int maxArea(int[] height) {
        if(height.length < 2 || height == null)
            return 0;
        int max_area = Integer.MIN_VALUE, i = 0;
            
        while(i < height.length) {
            int j = i + 1;
            
            while(j < height.length) {
                if(Math.min(height[i], height[j]) * (j - i) > max_area)
                    max_area = Math.min(height[i], height[j]) * (j - i);
                ++j;
            }
            ++i;
        }
        return max_area;
    }
}