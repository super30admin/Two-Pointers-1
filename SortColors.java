// Time Complexity : O(N) N = length of array nums
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach
//Keep track of left, right and current pointers. Where the current would be swapped according to the value f left and right.

class SortColors {
    public void sortColors(int[] nums) {

        if (nums.length == 0 || nums == null)
            return;

        int left = 0, right = nums.length - 1, cur = 0;
        while (cur <= right) {
            if (nums[cur] == 0) {
                swap(nums, cur, left);
                left++;
                cur++;
            } else if (nums[cur] == 1) {
                cur++;
            } else {
                swap(nums, cur, right);
                right--;

            }
        }

    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}