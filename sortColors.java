// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
//2pointers
class Solution {
    int[] nums;

    public void sortColors(int[] nums) {
        int start = 0;
        int ind = 0;
        this.nums = nums;
        int end = nums.length - 1;

        while (ind <= end) {
            if (nums[ind] == 2) {
                swap(ind, end);
                end--;
            } else if (nums[ind] == 0) {
                swap(ind, start);
                start++;
                ind++;
            } else {
                ind++;
            }
        }
    }

    private void swap(int ind1, int ind2) {
        int temp = nums[ind1];
        nums[ind1] = nums[ind2];
        nums[ind2] = temp;
    }
}
