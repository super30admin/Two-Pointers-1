/**

Time Complexity : O(N)
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No

**/
class Solution 
{
    public int maxArea(int[] height) 
    {
        
        if(height == null || height.length <2) return 0;
        
        
        int left = 0;
        int right = height.length -1;
        
        int maxArea = 0;
        
        while(left < right)
        {
            int leftHeight = height[left];
            int rightHeight = height[right];
            
            maxArea = Math.max(maxArea, (right-left)*Math.min(leftHeight, rightHeight));
            
            if(leftHeight <= rightHeight){
                left++;
            }
            else
            {
                right--;
            }
        }
        
        
        return maxArea;
    }
}