// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No 


// Your code here along with comments explaining your approach

class Solution {
    public void sortColors(int[] nums) {
        if(nums.length==0 || nums.length==1) return;
        int start =0;
        int end = nums.length-1;
        int index=0;
        
        while(index<=end && start< end){
            if(nums[index]==0){
                nums[index] = nums[start];
                nums[start]=0;
                start++;
                index++;
            }
            else if(nums[index]==2){
                nums[index] = nums[end];
                nums[end]=2;
                end--;
            }
            else{ 
                index++;
            }
        }
    }
}