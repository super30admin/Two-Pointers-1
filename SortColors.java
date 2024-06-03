// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// logic: To sort the colors in-place, we use three pointers: left to track the position for 0s,
// right for 2s, and mid for the current element. As we iterate through the array with mid, we swap 0s to the front and 2s to the end,
// adjusting the pointers accordingly, and leave 1s in place.

class Solution {
    public void sortColors(int[] nums) {
        if(nums == null || nums.length == 0){
            return ;
        }
        int n = nums.length;
        int left = 0;
        int right = n-1;
        int mid = 0;
        while(mid <= right){
            if(nums[mid] == 2){
                swap(nums,mid, right);
                right--;
            }
            else if(nums[mid] == 0){
                swap(nums,mid, left);
                left++;
                mid++;
            }
            else{
                mid++;
            }
        }
    }

    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}