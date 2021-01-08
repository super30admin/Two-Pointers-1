// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes


class Solution {
    public void sortColors(int[] nums) {
        if(nums == null || nums.length == 0 || nums.length == 1)
            return;
        
        int zero_pointer = 0;
        int two_pointer = nums.length-1;
        
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0)
                zero_pointer++;
            if(nums[i] == 2)
                two_pointer--;
        }
        for(int i =0; i< zero_pointer; i++)
            nums[i] = 0;
        for(int i= zero_pointer; i <= two_pointer; i++)
            nums[i] = 1;
        for(int i= two_pointer+1 ; i <nums.length; i++)
            nums[i] = 2;
        return;
    }
}