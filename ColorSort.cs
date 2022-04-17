using System;
using System.Collections.Generic;
using System.Text;

namespace ConsoleApp1
{
    public class ColorSort
    {
        /*
         * T.C: O(n) since traversing all elements of array
         * S.C: O(1) no extra space used
         */
        public void SortColors(int[] nums)
        {
            int low = 0;
            int high = nums.Length - 1;
            int mid = 0;

            while (mid <= high)
            {
                if (nums[mid] == 2)
                {
                    swap(nums, mid, high);
                    high--;
                }
                else if (nums[mid] == 0)
                {
                    swap(nums, mid, low);
                    low++;
                    mid++;
                }
                else
                {
                    mid++;
                }
            }

        }

        private void swap(int[] nums, int i, int j)
        {
            int temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;
        }
    }
}
