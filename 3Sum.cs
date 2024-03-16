// Time Complexity: O(N^2) where N is the number of elements in the input array nums. The algorithm iterates through the array once and performs a two-pointer technique, which takes O(N) time.
// Space Complexity: O(1) excluding the space required for the output list. The algorithm uses only a constant amount of extra space.

// Did this code successfully run on Leetcode: Yes

// Any problem you faced while coding this: NO



public class Solution {
    public IList<IList<int>> ThreeSum(int[] nums) {
        IList<IList<int>> result = new List<IList<int>>();
        int n = nums.Length;
        Array.Sort(nums);

        for(int i=0; i<n-2; i++)
        {
            //outside duplicacy
            if(i!=0 && nums[i] == nums[i-1])
            {
                continue;
            }
            int l = i+1;
            int h = n-1;

            while(l<h)
            {
                int currSum = nums[i] + nums[l] + nums[h];
                if(currSum == 0)
                {
                    result.Add(new List<int> { nums[i], nums[l], nums[h] });
                    l++;
                    h--;
                    while(l< h && nums[l] == nums[l-1])
                    {
                        l++;
                    }
                    while(l< h && nums[h] == nums[h+1])
                    {
                        h--;
                    }
                }else if(currSum <0)
                {
                    l++;
                }
                else
                {
                    h--;
                }
            }

        }
        return result;
    }
}