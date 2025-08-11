# Two-Pointers-1

## Problem1 (https://leetcode.com/problems/sort-colors/)
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

class Solution {
    public void sortColors(int[] nums) {
     
     // initialize mid, low and high to keep track of 1 2 and 0
     int mid = 0, low = 0, high = nums.length-1;
     
     // complete until mid 1 < high 2
     while(mid <= high) {
        // if number is 2 its high so swap with mid and decrement high
        if(nums[mid] == 2) {
            swap(nums, mid, high);
            high--;
        }
        // if numer is 0 its low so swap with mid and increment low and mid
        else if(nums[mid] == 0) {
            swap(nums, mid, low);
            low++;
            mid++;
        }
        // else increment mid 
        else {
            mid++;
        }
     }
    }

    // Swap 2 numbers in array using constant temp
    public void swap(int[] nums, int mid, int swapInt) {
        int temp = nums[mid];
        nums[mid] = nums[swapInt];
        nums[swapInt] = temp;
    }
}