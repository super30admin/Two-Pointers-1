using System;
using System.Collections.Generic;
using System.Text;

namespace LeetCodeSuper30
{
    class Sum3LC
    {
        //brute force approach
         //Time Complexity: O(n^3)
        //Space Complexity: O(n)
        public List<List<int>> ThreeSum(int[] nums)
        {
            if (nums == null || nums.Length == 0)
            {
                return new List<List<int>>();
            }
            int n = nums.Length;
            HashSet<List<int>> set = new HashSet<List<int>>();
            for (int i = 0; i < n - 2; i++)
            {
                for (int j = i + 1; j < n - 1; j++)
                {
                    for (int k = j + 1; k < n; k++)
                    {
                        if (nums[i] + nums[j] + nums[k] == 0)
                        {
                            List<int> li = new List<int> { nums[i], nums[j], nums[k] };
                            li.Sort();
                            set.Add(li);
                        }
                    }
                }
            }
            return new List<List<int>>(set);
        }

        //Optimized
        //Time Complexity: O(n^2) + O(nlogn)
        //Space Complexity: O(1)
        public IList<IList<int>> ThreeSumOptimized(int[] nums)
        {
            if (nums == null || nums.Length == 0)
            {
                return new List<IList<int>>();
            }
            int n = nums.Length;
            List<IList<int>> result = new List<IList<int>>();
            Array.Sort(nums);
            for (int i = 0; i < n; i++)
            {
                if (nums[i] > 0) break;
                if (i != 0 && nums[i] == nums[i - 1]) continue;
                int low = i + 1, high = n - 1;
                while (low < high)
                {
                    int sum = nums[i] + nums[low] + nums[high];
                    if (sum == 0)
                    {
                        List<int> li = new List<int> { nums[i], nums[low], nums[high] };
                        result.Add(li);
                        low++;
                        high--;
                        while (low < high && nums[low] == nums[low - 1]) low++;
                        while (low < high && nums[high] == nums[high + 1]) high--;
                    }
                    else if (sum > 0)
                    {
                        high--;
                    }
                    else
                    {
                        low++;
                    }
                }

            }
            return result;
        }
    }
}
