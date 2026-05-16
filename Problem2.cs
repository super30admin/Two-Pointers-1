// Time Complexity : O(n) where n is the total length of nums array
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

public class Solution {
    public IList<IList<int>> ThreeSum(int[] nums) {
        Array.Sort(nums);
        List<IList<int>> result = new();
        for(int i = 0; i < nums.Length - 2; i++)
        {
            if(i>0 && nums[i]==nums[i-1])
            {
                continue;
            }

            int first = nums[i];
            int second = i+1, third = nums.Length -1;
            while(second < third)
            {
                if(nums[second] + nums[third] == -first)
                {
                    List<int> temp = new();
                    temp.Add(first);
                    temp.Add(nums[second]);
                    temp.Add(nums[third]);
                    result.Add(temp);
                    while(second < third && nums[second] == nums[second+1])
                    second++;
                    while(second < third && nums[third] == nums[third-1])
                    third--;
                    second++;
                    third--;
                }

                else if(nums[second] + nums[third] < -first)
                {
                    second ++;
                }

                else
                {
                    third --;
                }
            }
        }

        return result;
    }
}