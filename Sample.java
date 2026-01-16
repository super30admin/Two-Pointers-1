// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

class Solution {
    public void sortColors(int[] nums) {
       if(nums.length==1) return; 
       int i = 0;
       int mid = 0;
       int k = nums.length-1;
       while(mid<=k){
          if(nums[mid]==2){
             swap(nums,mid,k);
             k--;
          }else if(nums[mid]==0){
             swap(nums,mid,i);
             i++; mid++;
          }else{
             mid++;
          }
       } 
    }
    void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}