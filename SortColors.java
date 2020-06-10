// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


class Solution {
    public void sortColors(int[] nums) { 
        if(nums == null || nums.length == 0) return; 
        // using two pointer technique 
        //left = 0, right = last element and index is the pointer with which we swap
        // left will collect 0s
        // right will collect 2s
        // index will collect 1s
        int left = 0, right = nums.length - 1, index = 0;
    
        while (index <= right) {
            
            // if index == 1, increment index as 1 is in correct position
            if(nums[index] == 1) {
                index++;
            }
            // if index == 0, swap index with left and increment both index and left       
            else if (nums[index] == 0) {           
                nums[index] = nums[left];
                nums[left] = 0;
                left++;
                index++; 
            }
            // if index == 2, swap index with right and decrement high only
            // as element swaped can be 0, and zero should be later swapped with left
            else {            
                nums[index] = nums[right];            
                nums[right] = 2;         
                right--; 
            }
    
        }
    }
}
