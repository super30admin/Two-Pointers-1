// Time Complexity :O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Understood from the class


// Your code here along with comments explaining your approach

class Solution {
    public void sortColors(int[] nums) {
        
        if(nums==null || nums.length==0){
            return;
        }
        
        int left=0;
        int right=nums.length-1;
        int curr=0;
        while(curr<=right){
            if(nums[curr]==0)
            {
                swap(nums,curr,left);
                curr+=1;
                left+=1;
            }else if(nums[curr]==1){curr++;}
            else{
                swap(nums,curr,right);
                right-=1;
            }
     } }
    
    private void swap(int[] nums, int i, int j){
        int temp= nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}