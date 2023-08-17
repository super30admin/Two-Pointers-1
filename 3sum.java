// Time Complexity :O(n2)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :YES
// Any problem you faced while coding this :NO

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);

        for(int i=0;i<n;i++)
        {
            if(nums[i]>0)
            {
                break;
            }
            int low=i+1;
            int high=n-1;

            if(i>0 && nums[i]==nums[i-1])
            {
                continue;
            }
            while(low<high)
            {
                int s = nums[i]+nums[low]+nums[high];
                if(s==0)
                {
                    List<Integer>x = Arrays.asList(nums[i],nums[low],nums[high]);

                    res.add(x);
                    low++;
                    high--;
                    while(low<high && nums[low]==nums[low-1])
                    {
                        low++;
                    }
                    while(low<high && nums[high]==nums[high+1])
                    {
                        high--;
                    }
                }
                else if(s<0)
                {
                    low++;
                }
                else
                {
                    high--;
                }
            }
        }
        return res;
    }
}