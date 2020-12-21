public class Solution {
    public IList<IList<int>> ThreeSum(int[] nums) {
       var len = nums.Length;
        nums = nums.OrderBy(x => x).ToArray<int>();
        List<IList<int>> result = new List<IList<int>>();
        for(int i=0;i<len;i++)
        {
            if (nums[i] > 0 ) break;
            if (i > 0 && nums[i - 1] == nums[i])
                continue;
            int start=i+1,last=len-1;
            while(start<last)
            {
                if(nums[start]+nums[last]+nums[i] > 0)
                    last--;
                else if(nums[start]+nums[last]+nums[i] < 0)
                    start++;
                else //if(nums[start]+nums[last]+nums[i] == 0)
                {
                    result.Add(new List<int>{nums[i],nums[start++],nums[last--]});
                    // Increment start prv value is same to avoid duplicates in the result.
                    while(start<last && nums[start-1]==nums[start]) start++;
                }
            }
        }
        return result;
        
    }
}
