// Time Complexity : O(n) --> where n is length of input array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode (75): Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public void sortColors(int[] nums) {
        if (nums == null || nums.length == 0) return;
        
        int n = nums.length;
        int low = 0;
        int mid = 0;
        int high = n - 1;
        
        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            }
            else if (nums[mid] == 1) mid++;
            else {
                swap(nums, mid, high);
                high--;
            }
        }
    }
    
    private void swap(int nums[], int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}