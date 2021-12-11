// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public void sortColors(int[] nums) {
        if (nums == null || nums.length == 0) return;
        int n = nums.length;
        int low = 0, mid = 0, high = n-1;

        // We stop the loop if the mid and high either match or cross over
        while (mid <= high) {
            // if nums[mid] is 0, we swap it with nums[low] since we want to keep 0 in the front
            if (nums[mid] == 0) {
                swap(nums, mid, low);
                low++;
                mid++;
            }
            // if nums[mid] is 2, we swap it with nums[high] since we want to keep 2 at the end
            else if (nums[mid] == 2) {
                swap(nums, mid, high);
                high--;
            }
            // nums[mid] == 1 case
            else {
                mid++;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}