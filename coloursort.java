// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :NO
// Your code here along with comments explaining your approach: use three pointers low, mid and high. low and mid start from the beginning of the array and high starts from the end of the array. If mid is 0, swap mid and low and increment both low and mid. If mid is 1, just increment mid. If mid is 2, swap mid and high and decrement high.
class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                // Swap mid and low
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                // Just move forward
                mid++;
            } else { // nums[mid] == 2
                // Swap mid and high
                int temp = nums[high];
                nums[high] = nums[mid];
                nums[mid] = temp;
                high--;
            }
        }
    }
}