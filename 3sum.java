1)3sum
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
           
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int l=i+1;
            int r=nums.length-1;
            while(l<r){
                if(nums[i]+nums[l]+nums[r]==0){
                    List<Integer> a =Arrays.asList(nums[i],nums[l],nums[r]);
                    Collections.sort(a);
                    result.add(a);
                    l=l+1;
                    r=r-1;
                    while(l<r && nums[l]==nums[l-1]){
                        l=l+1;
                    }
                    while(l<r && nums[r]==nums[r+1]){
                        r=r-1;
                    }
                    
                }
                else if(nums[i]+nums[l]+nums[r]<0){
                    l=l+1;
                    
                }
                
                else if(nums[i]+nums[l]+nums[r]>0){
                    r=r-1;
                    
                }
            }
            
        }
        return result;
        
    }
