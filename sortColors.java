// Time Complexity : O(n) where n is the length of the array nums
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach

class sortColors {
    public void sortColors(int[] nums) {
        if (nums.length == 0) return;
        int low = 0, mid = 0, high = nums.length - 1;
        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low, mid);
                mid++;
                low++;
            }
            else if (nums[mid] == 1) {
                mid++;
            } 
            else if (nums[mid] == 2) {
                swap(nums, mid, high);
                high--;
            }
        }
        return;
    }
    private void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}