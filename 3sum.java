class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        
        if(nums==null || nums.length==0)
            return result;
        
        Arrays.sort(nums);
        int n=nums.length;
       for(int fixed=0;fixed<n-2;fixed++)
       {
           if(fixed==0 || (fixed>0 && nums[fixed]!=nums[fixed-1]))
           {
           int low=fixed+1;
           int high=n-1;
           int sum=0-nums[fixed];
           
           while(low<high)
           {
               if((nums[low]+nums[high])>sum)
                   high--;
               else if((nums[low]+nums[high])<sum){
                   low++;
               }
               else if((nums[low]+nums[high])==sum){
                   result.add(new ArrayList<Integer>(Arrays.asList(
                       nums[low],
                       nums[fixed],
                       nums[high]
                   )));
                   
                  while(low<high && nums[low]==nums[low+1]) low++;
                  while(low<high && nums[high]==nums[high-1]) high--;
                   
                   low++;
                   high--;
                
             }
             }
           }
       }
    return result;
    }
}
