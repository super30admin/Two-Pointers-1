// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO


// Your code here along with comments explaining your approach

/**
 * We have multiple approaches to solve this problem, the easiest being sorting the array.
 * But since it is possible to optimize on the TC, we can use 3 pointers to keep track of
 * each unique number.
 * Low will collect 0, mid will collect 1 and high will collect 2
 */


public class Problem1 {
    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 2) {
                swap(nums, mid, high);
                high--;
            } else {
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
