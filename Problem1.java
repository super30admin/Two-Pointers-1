// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
class Solution {
    public void sortColors(int[] nums) {
        
        if(nums==null || nums.length<=0){
            return;
        }
        
        int redCount=0;
        int whiteCount=0;
        int blueCount=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                redCount++;
            }else if(nums[i]==1){
                whiteCount++;
            }else if(nums[i]==2){
                blueCount++;
            }
        }
        
        for(int i=0;i<redCount;i++){
            nums[i]=0;
        }
        
        for(int i=redCount;i<redCount+whiteCount;i++){
            nums[i]=1;
        }
        
        for(int i=redCount+whiteCount;i<nums.length;i++){
            nums[i]=2;
        }
        
    }
}