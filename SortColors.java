// Time Complexity : 0(n)
// Space Complexity : 0(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

class Solution {
    public void sortColors(int[] nums) {
        if(nums == null || nums.length == 0){
            return;
        }

        int r = 0;

        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                int temp = nums[i];
                nums[i] = nums[r];
                nums[r] = temp;
                r++;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 1){
                int temp = nums[i];
                nums[i] = nums[r];
                nums[r] = temp;
                r++;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 2){
                int temp = nums[i];
                nums[i] = nums[r];
                nums[r] = temp;
                r++;
            }
        }
    }
}