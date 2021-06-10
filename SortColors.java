// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

/**
 * In this problem, I have used the approach of pointers to sort 0,1 and 2.
 * 0 --> zero_index will be the holding all the 0s
 * zero_index + 1 --> twos_index - 1 will hold all the 1s
 * twos_index --> nums.length -1  will hold all 2s
 */

class Solution {
    public void sortColors(int[] nums) {
        int zero_index = 0;
        int twos_index = nums.length - 1;
        
        int i=0;
        
        while (i <= twos_index) {
            if(nums[i] == 0) {
                // swap i with zero_index
                swap(nums, i, zero_index);                
                // move the zero_index pointer right by 1
                zero_index++;
                
                i++;
            } else if (nums[i] == 1) {
                i++;
            } else if (nums[i] == 2) {
                // swap with twos_index
                swap(nums, i, twos_index);
                // int temp = nums[twos_index];
                // nums[twos_index] = nums[i];
                // nums[i] = temp;
                // move the end pointer left by 1
                twos_index--;
            }
        }
    }
    
    void swap(int[] nums, int start, int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}