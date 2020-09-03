// Time Complexity : O(n*2)
// Space Complexity : O(1) , no extra space
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
     if(nums==null||nums.length==0) return new ArrayList<>();
     List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);
       
        
        for(int i=0;i<nums.length-2;i++){
            if(i!=0&&nums[i-1]==nums[i]) { continue; }
            int l=i+1; int  r=nums.length-1;
            while(l<r){
           int  sum=nums[l]+nums[i]+nums[r];
            if(sum==0){
                res.add(Arrays.asList(nums[l],nums[i],nums[r]));
                l++;
                r--;
                while(l<r && nums[l]==nums[l-1]){
                    l++;
                }
                  while(l<r && nums[r]==nums[r+1]){
                    r--;
                }
            } else if(sum<0){
                l++;
                 while(l<r && nums[l]==nums[l-1]){
                    l++;
                }
                 
            }
            else{
                r--;
                while(l<r && nums[r]==nums[r+1]){
                    r--;
                }
                
            }
        }
        
        }
        return res;
    }
          
}