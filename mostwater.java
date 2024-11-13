// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :
//approach : we use 2 pointer approach to find the max volume possible. we find the volume with the lowest 
// height among the 2 pointers and comapre it with the max volume. we move the pointer with the lowest height
// and compare the new volume with the max volume.

// Your code here along with comments explaining your approach

public class mostwater {
    class Solution {
        public int maxArea(int[] height) {
            int low=0,n=height.length,high=n-1;
            int max=0;
            int vol;
            while(low<high)
            {
    
                if(height[low]<height[high])
                {
                    vol=height[low]*(high-low);
                    low++;
                }
                else 
                {
                    vol=height[high]*(high-low);
                    //max=Math.max(max,vol);
                    high--;
                }
                max=Math.max(max,vol);
            }
            return max;
        }
    }
}
