// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Understanding that I could use two pointer approach
// took time

class Solution {
    public int maxArea(int[] height) {
        
        if(height==null || height.length==0)
            return 0;
        
        int low=0,high=height.length-1,area=0;
        while(low<high)
        {
            if(height[low]<height[high])
            {
                area=Math.max(area,height[low]*(high-low));
                low++;
            }
            else
            {
                area=Math.max(area,height[high]*(high-low));
                high--;
            }
        }
        
        return area;
    }
}
