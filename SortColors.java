//Time complexity- O(n)
//Space Complexity- O(1)
//Successfully ran on leetcode

class Solution {
 public void sortColors(int[] nums) {
     if(nums.length==0 || nums== null) return;
     
     int low=0;
     int mid= 0; 
     int high= nums.length-1;
         
         while(mid<= high){
         
         if(nums[mid]==1){
             mid++;
         }
         else if(nums[mid]==0){
             swap(nums, mid , low);
             low++;
             mid++;
         }
         else{
             swap(nums , mid, high);
             high--;
         }
         }
     }
 
 
 private void swap(int[] nums,int i, int j){
     
     int temp=0;
     
     temp = nums[i];
     nums[i]=nums[j];
     nums[j]=temp;
 }
}