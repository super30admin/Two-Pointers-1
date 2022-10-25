// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public void sortColors(int[] nums) {
        
        int l = 0, r = nums.length-1, i = 0;
        
        while(i<=r){
            if(nums[i] == 0){
                swap(i,l, nums);
                ++i;
                ++l;
            }
            else if (nums[i] == 2){
                swap(i,r, nums);
                --r;
            }
            else{
                ++i;
            }
        }
        
    }
    
    public void swap(int i, int j, int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        
    }
}