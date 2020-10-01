// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

class Solution {
    public int maxArea(int[] height) {
        
        
        if( height == null || height.length == 0)
            return 0;
        
        int result = Integer.MIN_VALUE;
        int left =0;
        int right = height.length -1;
        
        while (left<right)
        {
            result = Math.max(result, Math.min(height[left],height[right]) *(right-left));
            
            if(height[left] < height[right])
                left++;
            else
                right--;
        }
        return result;
    }
}