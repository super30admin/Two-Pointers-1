// Time Complexity : O(n) where 'n'.
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : Yes, https://leetcode.com/problems/sort-colors/
// Any problem you faced while coding this : No


class Solution {
    public void sortColors(int[] nums) {
         if(nums==null || nums.length==0) return;
        int n = nums.length;
        int low = 0;
        int high = n-1;
        int mid = 0;
        while(mid<=high){
                if(nums[mid]==0){
                    swap(nums,low,mid);
                    low++;
                    mid++;
                }else if(nums[mid]==2){
                    swap(nums,mid,high);
                    high--;
                }else{
                mid++;
              }
            }
    }

    private void swap(int[]nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
