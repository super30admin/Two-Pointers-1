using System;
namespace Algorithms
{
    public class ContainerWithMostWater
    {
        /// Time Complexity : O(N)
        // Space Complexity :O(1)
        // Did this code successfully run on Leetcode :Yes
        // Any problem you faced while coding this :  Based on the discussion in class
        public int MaxArea(int[] height)
        {

            if (height == null || height.Length == 0) return 0;
            int n = height.Length;
            int left = 0;
            int right = n - 1;
            int max = 0;
            while (left < right)
            {
                max = Math.Max(max, Math.Min(height[left], height[right]) * (right - left));
                if (height[left] <= height[right])
                {
                    left++;
                }
                else
                {
                    right--;
                }
            }

            return max;
        }
    }
}
