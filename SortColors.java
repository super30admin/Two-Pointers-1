// Time Complexity : O(n).
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Approach : The approach is to use 3 pointers. Left pointer will be parsed only until 0's right will be until 2's and curr will be
// until 1's. If we come across them while curr is moving from start we should swap them respectively, that means we should loop
// only until right is encountered - means we came till sorted 2's.


class Solution {

    public void sortColors(int[] nums) {

        int left = 0;
        int right = nums.length - 1;
        int curr = 0;

        while (curr <= right) { //iterate until curr meets right as right will have only 2's
            if (nums[curr] == 0) {
                swap(nums, left, curr); //left should have only 0's
                left++;
                curr++;
            } else if (nums[curr] == 2) {
                swap(nums, right, curr); //right should have only 2's
                right--;
            } else {
                curr++; //curr should have only 1's
            }
        }
    }

    private void swap(int[] nums, int i, int j) { //swap logic
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}