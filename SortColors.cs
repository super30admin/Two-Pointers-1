using System;
using System.Collections.Generic;
using System.Text;

namespace LeetCodeSuper30
{
    class SortColorsLC
    {
        //Time Complexity O(n)
        //Space Complexity: O(1)
        public void SortColors(int[] nums)
        {
            if (nums == null || nums.Length == 0)
            {
                return;
            }
            int low = 0, mid = 0, high = nums.Length - 1;
            while (mid < high)
            {
                if (nums[mid] == 2){
                    swap(nums, mid, high);
                    high--;
                }
                else if (nums[mid] == 1)
                {
                    mid++;
                }
                else
                {
                    swap(nums, low, mid);
                    low++;
                    mid++;
                }
            }
        }
        private void swap(int[] nums, int i, int j)
        {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        private void swapWithoutTemp(int[] nums, int i, int j)
        {
            nums[i] = nums[i] + nums[j];
            nums[j] = nums[i] - nums[j];
            nums[i] = nums[i] - nums[j];
        }
    }
}
