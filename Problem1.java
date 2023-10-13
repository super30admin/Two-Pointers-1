// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
class Solution {
    private void swap(int[] nums,int a ,int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    public void sortColors(int[] nums) {
       int n = nums.length;
       int lo = 0,mid = 0,hi = n - 1; 
       while(mid <= hi){
           if(nums[mid]==0){
               swap(nums,mid,lo);
               mid++;
               lo++;
           }
           else if(nums[mid]==1)
            mid++;
            else{
                swap(nums,mid,hi);
                hi--;}
                
            }
    }
}