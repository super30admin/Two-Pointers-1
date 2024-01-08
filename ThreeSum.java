// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        List<List<Integer>> result= new ArrayList<>();
        Arrays.sort(nums);
       
        for(int i=0; i<n-2;i++){
            if(nums[i]>0) break;
            if(i!=0 && nums[i]==nums[i-1]){
                continue;
            }
            
            int lp=i+1;
            int rp=n-1;

            while(lp<rp){
                int sum=nums[i]+nums[lp]+nums[rp];
                if(sum==0){ 
                    result.add(Arrays.asList(nums[i], nums[lp], nums[rp]));
                       
                    lp++;
                    rp--;
                
                    while(lp<rp && nums[lp]==nums[lp-1]){
                        lp++;
                    }
                    while(lp<rp && nums[rp]==nums[rp+1]){
                        rp--;
                    }
                       
                }    
                else if(sum<0){
                    lp++;
                }   
                else{
                    rp--;
                } 
                
            }
       
        }
        return result;
    }
}