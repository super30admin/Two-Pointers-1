/*
Time Complexity : O(n)
Space Complexity : O(1)
Did this code successfully run on Leetcode : yes
Any problem you faced while coding this : no
*/



class ContainerWithMostWater
{
    public int maxArea(int[] height)
    {
        int low = 0;

        int high = height.length - 1;

        int max = Integer.MIN_VALUE;

        while(low < high)
        {
            max = Math.max(max,
                           Math.abs((high - low )
                                      * Math.min(height[high],height[low])));

            if(height[low] < height[high])
              low++;
            else if (height[low] > height[high])
              high--;
            else
            {
                low++;
                high--;
            }
        }

        return max;
    }
}
