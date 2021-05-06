// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/*
    We use three pointers, each to keep track of each of the colors.
    When we encounter 0/2 in mid, we push them to low or high accordingly.
*/

class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length-1;
        while (mid<=high){
            if (nums[mid]==0){
                swap(nums,low,mid);
                mid++;
                low++;
            }
            else if (nums[mid]==2){
                swap(nums,mid,high);
                high--;
            }
            else{
                mid++;
            }
        }
    }
    
    public void swap(int [] nums, int i, int j){
        if (i!=j){
            nums[i] = nums[i] + nums[j];
            nums[j] = nums[i] - nums[j];
            nums[i] = nums[i] - nums[j];
        }
    }
}