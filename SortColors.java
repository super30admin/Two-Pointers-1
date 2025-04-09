// Time complexity:- O(n)
// Space complexity:- O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach in three sentences
/**
 * Approach:
 * - The problem asks to sort an array with three distinct integers (0, 1, and 2), which can be seen as sorting the "colors" red, white, and blue.
 * - The Dutch National Flag algorithm is used here, with three pointers ('left', mid', 'right') to efficiently partition the array into three sections: 0s, 1s, and 2s.
 * - The `mid` pointer is used to traverse the array, and based on the value of `nums[mid]`, elements are swapped between `left` and `right` pointers to ensure that 0s are at the front, 1s are in the middle, and 2s are at the end.
 */


 class Solution {

    public void sortColors(int[] nums) {
        int n = nums.length; // Length of the array

        // Pointers to track the positions of 0s, 1s, and 2s
        int left = 0;  
        int right = n - 1;  
        int mid = 0;  

        // Traverse the array with the 'mid' pointer until it reaches the 'right' pointer
        while(mid <= right) {
            // If the current element is 2, swap it with the element at the 'right' pointer
            if(nums[mid] == 2) {
                swap(nums, mid, right); // Swap the 2 to its correct position
                right--;  // Move the 'right' pointer to the left as the 2 is now correctly placed
            }
            // If the current element is 0, swap it with the element at the 'left' pointer
            else if(nums[mid] == 0) {
                swap(nums, mid, left); 
                left++;  
                mid++; 
            }
            // If the current element is 1, simply move the 'mid' pointer forward
            else {
                mid++;  
            }
        }
    }

    // Helper function to swap two elements in the array
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

