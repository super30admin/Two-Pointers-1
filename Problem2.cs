public class Solution
	{
        // Time Complexity : O(n^2)
        // Space Complexity : O(1)
        // Did this code successfully run on Leetcode : Yes
        // Any problem you faced while coding this : No
        public IList<IList<int>> ThreeSum(int[] nums)
        {
            IList<IList<int>> result = new List<IList<int>>();
            int n = nums.Length;
            Array.Sort(nums);
            for(int i = 0; i < n -2; i++)
            {
                //handle outside duplicates
                if(i > 0 && nums[i] == nums[i-1])
                {
                    continue;
                }
                int l = i + 1;
                int r = n - 1;
                while(l < r) //base case
                {
                    int currSum = nums[i] + nums[l] + nums[r];
                    if(currSum == 0)
                    {
                        //add to result
                        IList<int> li = new List<int>();
                        li.Add(nums[i]);
                        li.Add(nums[l]);
                        li.Add(nums[r]);
                        result.Add(li);
                        l++;
                        r--;
                        //handle inside duplciates
                        while (l < r && nums[l] == nums[l-1])
                        {
                            l++;
                        }
                        while(l < r && nums[r] == nums[r +1])
                        {
                            r--;
                        }
                    }
                    else if(currSum > 0)
                    {
                        r--;
                    }
                    else
                    {
                        l++;
                    }
                }
            }
            return result;
        }
    }
