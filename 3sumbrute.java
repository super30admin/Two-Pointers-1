class Solution {
    //tc - o(n3)
    //sc-o(1)
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        HashSet<List<Integer>> set = new HashSet<>();
        if(nums==null || n==0)return null;
        
        for(int i=0;i<n-2;i++)
        {
            for(int j=i+1;j<n-1;j++)
            {
                for(int k=j+1;k<n;k++)
                {
                    if(nums[i]+nums[j]+nums[k] == 0)
                    {
                        List<Integer>li = Arrays.asList(nums[i],nums[j],nums[k]);
                        Collections.sort(li);
                        set.add(li);
                    }
                }
            }
        }
        return new ArrayList<>(set);
        
    }
}