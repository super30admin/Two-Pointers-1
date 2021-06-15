// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public void sortColors(int[] nums) {
        if(nums == null || nums.length==0) return ;
        int n= nums.length;
        int left=0; int right=n-1; int mid=0;
        while(mid<=right){
            if(nums[mid]==0){
                swap(nums,left,mid);
                left++;
                mid++;
            }else if(nums[mid]==2){
                swap(nums,right,mid);
                right--;
            }else{
                mid++;
            }
        }
        
    }
    private void swap(int[] nums, int left, int right){
        int temp= nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}