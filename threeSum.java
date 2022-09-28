class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        
        int n=nums.length;
        
        Arrays.sort(nums);
        
        List<List<Integer>> list=new ArrayList<>();
        
        for(int i=0;i<n;i++)
        {
            if(i>0 && nums[i]==nums[i-1])
                continue;
            
            if(nums[i]>0)
                break;
            
            int l=i+1;
            int h=n-1;
            while(l<h)
            {
                int val=0-nums[i];
                
                if(nums[l]+nums[h]==val)
                {
                    List<Integer> li=new ArrayList<>();
                    
                    li.add(nums[i]);
                    li.add(nums[l]);
                    li.add(nums[h]);
                    System.out.println(li);
                    list.add(li);
                    
                    l++;
                    h--;
                    while(l<h && nums[l]==nums[l-1])
                    {
                            l++;
                    }
                    while(l<h && nums[h]==nums[h+1])
                    {
                        h--;
                    }
                    
                    
                }
                else if(nums[l]+nums[h]<val)
                {
                    l++;
                }
                else{
                    h--;
                }
                
            }
            
        }
        
        return list;
        
    }
}

// Time Complexity : O(n*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no