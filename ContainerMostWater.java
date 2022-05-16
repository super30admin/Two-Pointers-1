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
        if(height == null || height.length ==0)
        {
            return 0;
        }
        
        int start = 0;
        int end = height.length -1;
        
        int maxWater = 0;
        
        while(start<end)
        {
            int currentHeight = Math.min(height[start], height[end]);
            int width = end - start;
            
            int currentCapacity = currentHeight * width;
            
            maxWater = Math.max(maxWater, currentCapacity);
            
            if(height[start] < height[end])
                start++;
            else
                end--;
        }
        
        return maxWater;
    }
}