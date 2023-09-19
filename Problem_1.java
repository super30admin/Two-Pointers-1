/*

Problem1 (https://leetcode.com/problems/sort-colors/)


Time Complexity : O(n)
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No

*/

class Solution {
    public void sortColors(int[] nums) {
        
        if(nums == null || nums.length == 0){
            return;
        }

        int n = nums.length;
        int left = 0;
        int right = n-1;
        int mid = 0;
        while(mid <= right){
            if(nums[mid] == 0){
                swap(nums, mid, left);
                left++;
                mid++;
            }
            else if(nums[mid] == 2){
                swap(nums, mid, right);
                right--;
            }
            else{
                mid++;
            }
        }
    }

    private void swap(int[] arr, int val1, int val2){
        int temp = arr[val1];
        arr[val1] = arr[val2];
        arr[val2] = temp;
    }
}
