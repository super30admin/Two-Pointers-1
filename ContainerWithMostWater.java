// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

public class ContainerWithMostWater
{
    class Solution {
        public int maxArea(int[] height)
        {
            int maxAreaResult = Integer.MIN_VALUE;
            int start = 0, end = height.length-1;

            while(start < end)
            {
                int area = ( (end-start) * Math.min(height[start], height[end]) );
                maxAreaResult = Math.max(maxAreaResult, area);
                if(height[start] > height[end])
                    end--;
                else
                    start++;
            }
            return maxAreaResult;
        }
    }
}
