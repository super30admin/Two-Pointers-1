/**
Problem: https://leetcode.com/problems/sort-colors/
TC: O(n)
SC: O(1)
*/
class Solution {
    public void sortColors(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        
        int pointer0 = 0, pointer2 = nums.length - 1, i = 0;
        
        while (i <= pointer2) {
            if (nums[i] == 0) {
                swap(nums, i, pointer0);
                ++pointer0;
                ++i;
            } else if (nums[i] == 2) {
                swap(nums, i, pointer2);
                --pointer2;
            } else {
                ++i;
            }
        }
    }
    
    private void swap(int nums[], int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}