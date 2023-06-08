// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Had to refer the class discussion


// Your code here along with comments explaining your approach

class Solution {
    public void sortColors(int[] nums) {
        //Dutch Flag Algorithm as 3 unique elements in array 0,1,2
        //Hence we use 3 pointers - left, mid, right
        int left = 0; int mid = 0; int right = nums.length - 1;
        while(mid <= right){
            if(nums[mid] == 0){
                swap(nums,left,mid);
                left++; mid++;
            }else if(nums[mid] == 1){
                mid++;
            }else if(nums[mid] == 2){
                swap(nums,mid,right);
                right--;
            }
        }
    }

    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}