// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None


// Your code here along with comments explaining your approach

class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while(mid <= high){
            if(nums[mid] == 1){
                mid++;
            }else if(nums[mid] == 0){
                swap(nums, mid, low);
                mid++;
                low++;
            }else if(nums[mid] == 2){
                swap(nums, mid, high);
                high--;
            }
        }
    }
    private void swap(int[] nums, int num1, int num2){
        int temp = nums[num1];
        nums[num1] = nums[num2];
        nums[num2] = temp;
    }
}
