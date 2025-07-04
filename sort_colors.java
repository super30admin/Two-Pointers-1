// Given an array - nums with values 0, 1 and 2, indicating 3 different colors, we are supposed to sort without using sort functions
// such that the resultant array has them in order - [0,0,1,1,2,2..]
// In this solution, we use 3 pointers to achieve this in place
// TC: O(n) - we are iterating over the given array only once
// SC: O(1) - no additional data structures are being used
class Solution {
    public void sortColors(int[] nums) {
        if(nums == null || nums.length == 0){
            return;
        }
        // Initialize left to 0, right to last of nums and pointer to 0
        int left = 0;
        int right = nums.length - 1;
        int pointer = 0;

        while(pointer<=right){
          // If nums[pointer] is zero, swap with left and increment left and pointer
          if (nums[pointer] == 0){
                int temp = nums[pointer];
                nums[pointer] = nums[left];
                nums[left] = temp;
                left++;
                pointer++;
            }
          else {
            // If nums[pointer] is 2, swap with right and increment right only
            if (nums[pointer] == 2){
              int temp = nums[pointer];
              nums[pointer] = nums[right];
              nums[right] = temp;
              right--;
            }
            // Value is 1, no need to swap and increment point only
            else {
                pointer++;
              }
            }
        }
    }
}
