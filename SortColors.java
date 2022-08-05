// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
// 1. Two pointer approach

//75. Sort Colors (Medium) - https://leetcode.com/problems/sort-colors/
class Solution {
    public void sortColors(int[] nums) {
        if (nums == null || nums.length == 0) return;
        
        int low = 0, mid = 0, high = nums.length-1;
        
        while (mid <= high) {
            if (nums[mid] == 2) {
                swap(nums, mid, high);
                high--;
            } else if (nums[mid] == 0) {
                swap(nums, mid, low);
                low++;
                mid++;
            } else {
                mid++;
            }
        }
    }
    
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}