class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int ans=Integer.MIN_VALUE;
        int i=0,j=n-1;
        while(i<j)
        {
            if(height[i]<height[j])
            {
                ans=Math.max(ans,height[i]*(j-i));
                i++;
            }
            else
            {
                ans=Math.max(ans,height[j]*(j-i));
                j--;
            }
            
        }

        return ans;
            
    }
}

// Time Complexity : O( N )
// Space Complexity : O( 1 )
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no