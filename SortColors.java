// Time Complexity :  O(N) 
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No

class Solution {
    public void sortColors(int[] nums) {
        int i = 0;
        int low = 0; 
        int high = nums.length - 1;
        while(i<=high){
            if(nums[i] == 0){
                swap(nums, low++, i++);
            }
            else if(nums[i] == 2){
                swap(nums, i ,high --);
            }
            else{
                i++;
            }
        }
    }
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}