//Time Complexity : O(n^2)
//Space COmplexity : O(1)

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
     
        int sum = 0;
        ArrayList<List<Integer>> arr = new ArrayList<>();
        
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length-2;i++)
        {
            int low = i+1;
            int high = nums.length-1;
            
            if(i!=0 && nums[i-1]==nums[i])
            {
                continue;
            }
            
            while(low<high)
            {
                sum = nums[i] + nums[low] + nums[high];
                
                if(sum==0)
                {
                    arr.add(Arrays.asList(nums[i],nums[low],nums[high]));
                    
                    while(low<high && nums[low]==nums[low+1])
                    {
                        low++;
                    }
                    while(low<high && nums[high-1]==nums[high])
                    {
                        high--;
                    }
                    
                    low++;
                    high--;
                }
                else if(sum>0)
                {
                    high--;
                }
                else
                {
                    low++;
                }
            }
        }
        
        return arr;
    }
}