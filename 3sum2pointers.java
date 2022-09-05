class Solution {
    //tc - o(n2)
    //sc-o(1)
    public List<List<Integer>> threeSum(int[] nums) {
    int n = nums.length;
    List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int sum=0;
        for(int i=0;i<n-2;i++)
        {
            if(nums[i]>0)break;
            int low = i+1;
            int high = n-1;
            
            if(i!=0&&nums[i]==nums[i-1]) continue;
            while(low<high)
            {
                sum= nums[i]+nums[low]+nums[high];
                if(sum==0)
                {
                    List<Integer> li = Arrays.asList(nums[i],nums[low],nums[high]);
                    result.add(li);
                    
                    low++;high--;
                    //inside duplicacy as we do not want duplicates
                    while(low<high && nums[low]==nums[low-1]){ low++; }
                    while(low<high && nums[high] == nums[high-1]){high--;}
                }
                else if(sum>0)high--;
                else low++;
            }
            
        }
    
        return result;
        
    }
}