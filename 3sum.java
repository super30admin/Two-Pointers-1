class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> ans = new ArrayList<>();
        HashSet<Integer> h1 = new HashSet<Integer>();
        
        
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                int complement=0-(nums[i]+nums[j]);
                if(h1.contains(complement))
                {
                    List<Integer> l = new ArrayList<Integer>();
                    l.add(nums[i]);
                    l.add(nums[j]);
                    l.add(complement);
                    Collections.sort(l);
                    if(!ans.contains(l)){
                    ans.add(l);
                    }
                }
    
                    
            }
            h1.add(nums[i]);
        }
        
        return ans;
        
        
    }
}