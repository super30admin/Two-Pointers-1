// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public void sortColors(int[] nums) {
        int left = 0;
        int middle = 0;
        int right = nums.length-1;
        while(middle<=right) {
            if(nums[middle] == 2) {
                swap(nums, middle, right);
                // the reason to increment middle here is,
                // there is a possible we might get 0 from right pointer
                // for instance, [1,2,0]
                right --;
            } else if(nums[middle] == 0) {
                swap(nums, left, middle);
                left++;
                // as we know very well, we will have not anything other than 0 at the beginning,
                // we increment the middle index as well.
                middle++;
            } else{
                middle++;
            }
        }
    }
    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}