using System;
namespace Algorithms
{
    public class Array_SortColors
    {
        /// Time Complexity : O(N)
        // Space Complexity :O(1)
        // Did this code successfully run on Leetcode :Yes
        // Any problem you faced while coding this :  Based on the discussion in class
        public void SortColors(int[] nums)
        {
            if (nums == null || nums.Length == 0) return;
            int n = nums.Length;
            int left = 0, mid = 0, right = n - 1;

            while (mid <= right)
            {
                if (nums[mid] == 0)
                {
                    swap(nums, left, mid);
                    left++;
                    mid++;
                }
                else if (nums[mid] == 2)
                {
                    swap(nums, mid, right);
                    right--;
                }
                else
                {
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
    }
}
