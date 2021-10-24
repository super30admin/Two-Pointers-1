// Time Complexity : O(n)
// Space Complexity : O(1), No auxillary Space Needed
// Did this code successfully run on Leetcode : Yes, it successfully ran on Leetcode.

//Code
class Solution {
    public void sortColors(int[] nums) {
        int left = 0;
        int mid = 0;
        int right = nums.length-1;
        
        while(mid<=right){
            if(nums[mid] == 0){
                swap(nums, left, mid);
                left++; // We needed zero at the starting of the array.
                mid++;
            }else if(nums[mid] == 2){
                swap(nums, right, mid);
                right--;
            }else{
                mid++;
            }
        }
    }
    private void swap(int[] nums, int num1, int num2){
            int temp = nums[num1];
            nums[num1] = nums[num2];
            nums[num2] = temp;
    }
}