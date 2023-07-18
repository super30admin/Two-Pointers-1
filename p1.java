// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach

class Solution {
    public void sortColors(int[] nums) {

        // Using three pointers to swap the elements where high is used to keep track of
        // 2's and low is used to keep track of 0's
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;
        // Running the loop until mid exceeds high
        while (high >= mid) {
            // Swap with high if mmid encounters 2
            if (nums[mid] == 2) {
                swap(nums, mid, high);
                high--;
            }
            // Swap with low if mid encounters 0
            else if (nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            }
            // Increment mid if it encounters 1
            else {
                mid++;
            }
        }
    }

    // Swap function
    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}