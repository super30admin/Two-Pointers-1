// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : NA


// Your code here along with comments explaining your approach

class Solution {
    public void sortColors(int[] nums) {
        
        if (nums == null || nums.length == 0) return;
        
        int low = 0, curr = 0, high = nums.length - 1;
        
        while (curr <= high) {
            if(nums[curr] == 0) {
                swap(low, curr, nums);
                low++;
                curr++;
            } else if(nums[curr] == 1) {
                curr++;
            } else {
                swap(high, curr, nums);
                high--;
            }
        }
        
    }
    
    private void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}