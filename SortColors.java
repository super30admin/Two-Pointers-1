// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Keep two pointers start and end and store 0s, 1s and 2s in the following manner
// [0 ....start ..... end...nums.length]
// [00000011111111111111122222222222222]

class Solution {
    public void sortColors(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        
        int i=0;
        
        while(i <= end) {
            int currNum = nums[i];
            
            if (currNum == 0) {
                swap(nums, i, start);
                i++;
                start++;
            } else if (currNum == 1) {
                i++;
            } else if (currNum == 2) {
                swap(nums, i, end);
                end--;
            }
        }
    }
    
    private void swap(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}