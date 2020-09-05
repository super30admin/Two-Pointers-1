// Time Complexity :O(N^2)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums == null || nums.length==0){
            return new ArrayList<>();
        }
        
     int currSum=0;   
    List<List<Integer>> output = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){ 
            if(i!=0 && nums[i-1]==nums[i]){
                continue;
            }
               int left=i+1;
               int right=nums.length-1;
            
            while(left<right){
                
                currSum=nums[i]+nums[left]+nums[right];
                
                if(currSum==0){
                    output.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left+=1;
                    right=right-1;
                    while(left<right && nums[left]==nums[left-1]){
                        left=left+1; 
                    }
                    while(left<right && nums[right]==nums[right+1])
                    {
                        right=right-1;
                    }
                }else if(currSum<0){
                    left+=1;
                    while(left<right && nums[left]==nums[left-1]){
                        left=left+1; 
                    }
                }else{
                    right=right-1;
                    while(left<right && nums[right]==nums[right+1])
                    {
                        right=right-1;
                    }                
                }   
            }
        }
        return output;
    }
}