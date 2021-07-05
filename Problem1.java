// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

//Used three pointers where low and high are extremes and mid is on low. For this we check if mid==0 then swap mid and low and increment mid. If mid==1 thne just mid++ else if mid ==2 then swap high and mid. 

class Solution {
    public void sortColors(int[] nums) {

        int low = 0;
        int high = nums.length - 1;
        int mid = 0;

        while (mid <= high) {

            if (nums[mid] == 1) {
                mid++;
            } else if (nums[mid] == 0) {
                swap(nums, mid, low);
                low++;
                mid++;
            } else {
                swap(nums, mid, high);
                high--;
            }

        }

    }

    private void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
}