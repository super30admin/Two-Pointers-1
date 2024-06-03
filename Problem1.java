/*
    LC - 75. Sort Colors
    TC - O(n)
    SC - O(1)
    Approach - Using two pointer algorithm, we can keep three pointer and traversing the array based on the logic that left will hold 0, mid will hold 1 and right will hold 2.
*/

class Solution {
    public void sortColors(int[] nums) {
        if(nums == null || nums.length == 0) {
            return ;
        }
        int n = nums.length;
        int left = 0, mid = 0, right = n-1;
        while(mid <= right) {
            if(nums[mid] == 2) {
                swap(nums, mid, right);
                right--;
            } 
            else if (nums[mid] == 0){
                swap(nums, mid, left);
                left++;
                mid++;
            } else {
                mid++;
            }
        }
    }
    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
