class Solution {
    // Time Complexity : O(n)
    // Space Complexity : O(1)
    // Did this code successfully run on Leetcode : Yes
    // Any problem you faced while coding this : No

    public void sortColors(int[] nums) {
        int n = nums.length;
        int low = 0; int mid = 0; int high = n-1;
        while(mid <= high) {
            if(nums[mid] == 0){
                swap(nums, low, mid);
                low++;
                mid++;
            } else if(nums[mid] == 2) {
                swap(nums, high, mid);
                high--;
            } else { //nums[mid] == 1
                mid++;
            }
        }
    }

    public void swap(int[] nums, int x, int y) {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
}