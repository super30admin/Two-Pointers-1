// Time Complexity :o(n2 logn )
// Space Complexity :o(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int len = nums.length-1;
        int low = 0,cur = 0,high = len;
        Arrays.sort(nums);
        for(cur = 0; cur <= len; cur++)
        {
            if(cur>0 && (nums[cur] == nums[cur-1])) continue;
            low = cur + 1;
            high = len;
            while(low<high)
            {
                int sum = nums[cur] + nums[low] + nums[high];
                if(sum ==0)
                {
                    res.add(Arrays.asList(nums[cur] , nums[low] , nums[high]));
                    low++; high--;
                    while(low<high && nums[low] == nums[low-1]) low++;
                    while(low<high && nums[high] == nums[high+1]) high--;
                }
                else if(sum > 0)
                {
                    high--;
                }
                else
                    low++;
            }
        }
        return res;
    }
}