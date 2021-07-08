class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
//time: O(N^2)
//Space: O(1)

        Set<List<Integer>> hs= new HashSet<>();
        Arrays.sort(nums);
        
        //List<List<Integer>> result= new ArrayList<>();
        
        for(int i=0; i<nums.length-1; i++){
            int a =nums[i];
            int low= i+1, high= nums.length-1;
            
            while(low<high){
              
                if(a+nums[low]+nums[high]==0) 
                {
                hs.add(Arrays.asList(a, nums[low], nums[high]));
                   // System.out.println(a+ " "+nums[low]+" "+nums[high]);
                 low++;
                 high--;
                }
                else if(a+nums[low]+nums[high]>0)
                {
                    high--;
                }
                
                else low++;
        }
        
    }
      
        return new ArrayList<>(hs);
}
}