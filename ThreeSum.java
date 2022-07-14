// time complexity 0(m*n*k)
// space complexity 0(1)
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums.length == 0 || nums==null)
        {
            return new ArrayList<>();
        }
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int n =nums.length;
        for(int i=0;i<n;i++)
        {
            if(i>0 && nums[i] == nums[i-1]) continue;
            int left= i+1;
            int right=n-1;
            while(left<right )
            {
                int sum =nums[i]+nums[left]+nums[right];
                if(sum < 0 )
                {
                    left++;
                }
                else if(sum>0)
                {
                    right--;
                }
                else
                {
                    result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;
                    while(left < right && nums[left]==nums[left-1])
                    {
                        left++;
                    }
                    while(left < right && nums[right]==nums[right+1])
                    {
                        right--;
                    }
                }
            }
        }
        return result;
    }
}