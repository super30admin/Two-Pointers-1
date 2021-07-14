// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

class Solution {
    public void sortColors(int[] nums) {
        if(nums==null || nums.length==0)
            return;
        
        int low=0, high=nums.length-1, mid=0;
        
        while(mid<=high) {
            if(nums[mid] == 0) {
                swap(nums, low, mid);
                mid++;
                low++;
             }
            else if(nums[mid] == 1)
                mid++;
            else {
                swap(nums, mid, high);
                high--;
            }      
        }
    }
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}