// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach
// Two Pointer

class Solution {
    public int maxArea(int[] height) {
        int max =0;
        //edge case
        if(height==null) return 0;
        int i = 0;
        int j = height.length-1;
        while(i<j)
        {
            if(height[i]<=height[j])
            {
                max= Math.max(max,height[i]*(j-i));
                i++;
            }
            else
            {
                max= Math.max(max,height[j]*(j-i));
                j--;
            }
          
            
        }
        return max;
    }
    
}