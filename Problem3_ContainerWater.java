// Time Complexity : o(n)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution3 {
    public int maxArea(int[] height) {
        
        int low=0;
        int high=height.length-1;
        int max=0;
        while(low<high)
        {
            int lh=height[low];
            int rh=height[high];
            
            int width=high-low;
            int min_height=Math.min(lh,rh);
             max=Math.max(max,min_height*width);
            
            if(lh<rh)
                low++;
            else
                high--;
        }
        return max;
    }
}
