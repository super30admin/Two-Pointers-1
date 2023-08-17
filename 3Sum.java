// Time Complexity : O(n2)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new  ArrayList<>();
         Arrays.sort(nums);
        int n= nums.length;
        
        for(int i=0;i<n-2 ;i++)
        {
            if(nums[i] > 0){ 
             break;
            }
            if(i>0 && nums[i]==nums[i-1]) continue;
            
               int l = i+1, r = n-1; 
                while(l<r){
                int sum = nums[i]+ nums[l]+nums[r];
                if(sum==0){
                List<Integer> list = Arrays.asList(nums[i],nums[l],nums[r]);
                result.add(list);
                l++;r--;
                while(l<r&& nums[l]==nums[l-1]) l++;
                while(l<r && nums[r]==nums[r+1]) r--;
                }
                else if (sum>0){
                    r--;
                }
                else 
                  l++;
                }
        
        }
        return result;
    }
}