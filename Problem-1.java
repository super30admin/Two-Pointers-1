// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : 
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

class Solution {
    public void sortColors(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int mid = left;
        
        while(mid<=right) {
            if(nums[mid] == 0) {
                swap(nums,mid,left);
                mid++;
                left++;
            }
            else if(nums[mid] == 2) {
                swap(nums,mid,right);
                right--;
            }
            else {
                mid++;
            }
        }
    }
    private void swap(int[] nums,int x, int y) {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
}