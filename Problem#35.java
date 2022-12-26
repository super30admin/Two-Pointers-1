// SORT COLORS

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : -


// Your code here along with comments explaining your approach

class Solution {
    public void sortColors(int[] nums) {
        if(nums == null || nums.length == 0)
            return;
        int n = nums.length;
        int low = 0; //Pointer for red color
        int mid = 0; //Pointer for while color
        int high = n - 1; //Pointer for blue color

        while(mid <= high){
            if(nums[mid] == 0){ //If the color at mid position is red, swap it with element at low index
                swap(nums, low, mid);
                low++;
                mid++;
            } else if(nums[mid] == 2){ //If the color at mid position is blue, swap it with element at high index
                swap(nums, mid, high);
                high--;
            } else { //Do nothing if mid is pointing to white color
                mid++;
            }
        }
    }
    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}