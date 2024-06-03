// Time Complexity : O(n) => As we iterate over the entire array of size n
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/*
Approach: Used 2 pointer technique. We have 3 variables left (represents color red(0)), mid (represents color white(1)), right (represents color blue(2)).
Checking if mid == 1 then just move the mid pointer else check if mid == 0 then we need to swap left and mid value and move the pointer, else swap mid and right pointer and decrement the right pointer
 */
class Solution {
    public void sortColors(int[] nums) {

        if(nums.length == 0 || nums == null){
            return;
        }

        int low = 0;
        int right = nums.length -1;
        int mid = 0;

        while(mid <= right){

            if(nums[mid] == 1){
                mid++;
            }
            else if(nums[mid] == 0){
                swap(nums, mid, low);
                low++;
                mid++;
            }
            else{
                swap(nums,mid, right);
                right--;
            }
        }
    }

    //This method is used for swapping the elements
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}