// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :YES
// Any problem you faced while coding this :NO


class Solution {
    public int maxArea(int[] height) {
        int low = 0;
        int high = height.length-1;
        int n = height.length-1;
        int max=0;
        while(low<high)
        {
            int length = Math.min(height[low],height[high]);
            int width = high-low;
            int area = length*width;
            if(area>=max)
            {
                max=area;
            }
            if(height[low]>=height[high])
            {
                high = high-1;
            }
            else
            {
                low=low+1;
            }
        }
        return max;
    }
}
