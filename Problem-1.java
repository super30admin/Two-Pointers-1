// Time Complexity : O(N) 
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
class Solution {
    public void swap(int[] nums, int a, int b){
        int temp= nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
    public void sortColors(int[] nums) {
        int low=0;
        int mid=0;
        
        int high=nums.length-1;
        
        while(mid<=high){
            if(nums[mid]==2){
                swap(nums,mid,high);
                high--;
            }
            else if(nums[mid]==0){
                swap(nums,mid,low);
                low++;mid++;
            }
            else{
                mid++;
            }
        }
    }
}