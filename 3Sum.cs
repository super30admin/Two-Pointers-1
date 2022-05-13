using System;
using System.Collections.Generic;

namespace Algorithms
{
    public class ThreeSumAlg
    {
        /// Time Complexity : O(N2)
        // Space Complexity :O(1)
        // Did this code successfully run on Leetcode :Yes
        // Any problem you faced while coding this :  Based on the discussion in class
        public IList<IList<int>> ThreeSum(int[] nums)
        {
            IList<IList<int>> result = new List<IList<int>>();
            if (nums == null || nums.Length == 0) return result;
            int n = nums.Length;
            Array.Sort(nums);
            for (int i = 0; i < n - 2; i++)
            {
                int left = i + 1;
                int right = n - 1;

                if (i > 0 && nums[i] == nums[i - 1])
                {
                    continue;
                }
                while (left < right)
                {
                    int currentSum = nums[i] + nums[left] + nums[right];
                    if (currentSum == 0)
                    {
                        List<int> sum = new List<int> { nums[i], nums[left], nums[right] };
                        result.Add(sum);
                        left++;
                        right--;
                        while (left < right && nums[left] == nums[left - 1])
                        {
                            left++;
                        }
                        while (left < right && nums[right] == nums[right + 1])
                        {
                            right--;
                        }
                    }
                    else if (currentSum < 0)
                    {
                        left++;
                    }
                    else
                    {
                        right--;
                    }
                }
            }

            return result;
        }
    }
