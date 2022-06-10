// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this :

class Solution {

    private void swap(int[] nums, int i, int j) {

        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void sortColors(int[] nums) {

        // dutch national flag algo
        int lo = 0, mid = 0, hi = nums.length - 1;

        // MID WILL DRIVE THE ALGO
        while (mid <= hi) {

            if (nums[mid] == 0) {
                //swap with low
                swap(nums, lo, mid);
                mid++;
                lo++;
            } else if (nums[mid] == 1) mid++;
            else if (nums[mid] == 2) {
                swap(nums, mid, hi);
                hi--;
                // careful :: only decrease high
            }

        }

    }
}