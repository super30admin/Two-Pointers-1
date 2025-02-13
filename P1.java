// Time Complexity :    O(n)
// Space Complexity :   O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int l = 0;
        int r = n - 1;
        int mid = 0;

        while (mid <= r) {
            if(nums[mid] == 2) {
                swap (nums, mid, r);
                r --;
            } else if (nums[mid] == 0) {
                swap (nums, mid, l);
                l ++;
                mid ++;
            } else {
                mid ++;
            }
        }
    }

        private void swap(int[] arr, int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
         
}

