// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Nope


// Your code here along with comments explaining your approach
// Use 2 pointers to keep the max number i.e. 2 to the right and the min number i.e. 0 to the left
// the current running pointer if use to swap the elements thus sorting the array in place 
class Solution {
    public void sortColors(int[] nums) {
        if(nums == null || nums.length == 0)
            return;
        
        int left = 0;
        int right = nums.length -1;
        int curr = 0;
        
        while(curr <= right) {
            if(nums[curr] == 2) {
                swap(nums, curr, right);
                right--;
            } else if(nums[curr] == 0) {
                swap(nums, left, curr);
                left++;
                curr++;
            }else if(nums[curr] == 1) {
                curr++;
            }
        }
    }
    
    private void swap(int[] nums, int i, int j) {
        int x = nums[i];
        nums[i] = nums[j];
        nums[j] = x;
    }
}