using System;
using System.Collections.Generic;
using System.Text;

namespace LeetCodeSuper30
{
    class MaxAreaWaterTankLC
    {
        //brute force
        //Time Complexity: O(n^2)
        //Space Complexity: O(1)
        public int MaxArea(int[] height)
        {
            if (height == null || height.Length == 0)
            {
                return 0;
            }
            int max = 0;
            for (int i = 0; i < height.Length - 1; i++)
            {
                for (int j = i + 1; j < height.Length; j++)
                {
                    max = Math.Max(max, Math.Max(height[i], height[j]) * (j - i));
                }
            }
            return max;
        }
        //Optimized
        //Time Complexity: O(n)
        //Space Complexity: O(1)
        public int MaxAreaWaterTank(int[] height)
        {
            if (height == null || height.Length == 0)
            {
                return 0;
            }
            int max = 0;
            int low = 0, high = height.Length - 1;
            while (low < high)
            {
                max = Math.Max(max, Math.Min(height[low], height[high]) * (high - low));
                if (height[low] < height[high])
                {
                    low++;
                }
                else
                {
                    high--;
                }
             }
            return max;
        }
    }
}
