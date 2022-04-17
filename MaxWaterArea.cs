using System;
using System.Collections.Generic;
using System.Text;

namespace ConsoleApp1
{
    public class MaxWaterArea
    {
      /*
       * T.C: O(N) since we are traversing through entire array
       * S.C: O(1) No extra space used. 

        */
        public int MaxArea(int[] height)
        {
            int max = 0;
            int left = 0;
            int right = height.Length - 1;

            while (left < right)
            {
                //get the max between the two minimum left and right hight multiply by differnce of index
                max = Math.Max(max, Math.Min(height[left], height[right]) * (right - left));

                //if left hight is less than right then move left pointer
                if (height[left] < height[right])
                {
                    left++;
                }
                //else reduce right pointer
                else
                {
                    right--;
                }
            }
            return max;
        }
    }
}
