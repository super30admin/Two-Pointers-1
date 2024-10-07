// Time Complexity :0(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int low = 0, high = n-1,max =0;

        while(low<high)
        {
                int h = 0;
                int w = high - low;
                if(height[high]>height[low])
                {
                    h = height[low];
                    low++;
                }
                else
                {
                    h = height[high];
                    high--;
                }
        
                max= Math.max(max, h*w);
            
        }
        return max;
    }
}