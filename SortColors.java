// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
class Solution {
    public void sortColors(int[] nums) {
        // Return if array is null or empty
        if(nums == null || nums.length == 0 || nums.length == 1) return;
        // initialize low, mid and high pointers
        int low = 0; int mid = 0; int high = nums.length - 1;
        // traverse through the array
        while(mid <= high){
            // if 0 occurs at mid, swap it with element at low
            // increment low and mid
            if(nums[mid] == 0){
                swap(nums, low, mid);
                low++; mid++;
            } else if(nums[mid] == 2){
                // if 2 occurs at mid, swap it with element at high
                // increment high
                // no need to increment mid, because we don't know what element is being swapped
                swap(nums, high, mid);
                high--;
            } else {
                // if 1 occurs then increment mid
                mid++;
            }
        }
    }
    // helper function to swap elements in array
    private void swap(int[] nums, int x, int y){
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
}