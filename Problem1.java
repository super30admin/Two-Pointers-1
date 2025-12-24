/*
75. Sort Colors
Ran on leetcode: Yes
TC: O(n) SC: O(1)
Use 3 pointers, low and mid on first element of array and high on last element of array, traverse mid through array and if element on mid is 0 swap it with low and move low and mid pointer, if element is 2 swap between mid and high and move high pointer and if element is 1 it is already in correct position and move the mid pointer
*/
class Solution {
    public void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1; // Divide nums array in 3 sections

        while(mid <= high){
            if(nums[mid] == 0){ // Move the element with 0 value to low section
                swap(nums, low, mid); // swap the elements
                mid++; // Move mid, cauz the element is already at correct position, because we have seen it already
                low++; // Move low pointer, to place next 0 value element
            } else if(nums[mid] == 1){ // Correct position, move mid
                mid++;
            } else if(nums[mid] == 2){ // Move the element with 2 value to high section
                swap(nums, high, mid); // swap the elements
                high--; // Move high pointer, to place next 2 value element
            }
        }

    }

    private void swap(int[] nums, int i, int j){ // swap elements on index i and j
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}