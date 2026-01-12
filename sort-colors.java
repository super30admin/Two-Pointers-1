// Time Complexity :O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english : I take three pointers. One on the left, one on the right and another starting from left and traverse through the array. While traversing if it finds 2, then it swaps with the right pointer and if it finds 0 it swaps with left pointer. It traverse until it meets right pointer.


class Solution {
    public void sortColors(int[] nums) {
        int left = 0;
        int mid = 0;
        int right = nums.length -1;
        while(mid <= right) {
            if(nums[mid] == 2) {
                swap(nums, mid, right);
                right--;
            } else if (nums[mid] ==0) {
                swap(nums, mid, left);
                left++;
                mid++;
            } else {
                mid++;
            }
        }
    }

    private void swap(int[] nums, int pointer1, int pointer2) {
        int temp = nums[pointer1];
        nums[pointer1] = nums[pointer2];
        nums[pointer2] = temp;
    }
}