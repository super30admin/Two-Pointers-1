// Time Complexity : O(n), n is the length of the array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/**
 * 1. Use three pointers, low, mid and high.
 * 2. low pointer represents the 0s, mid pointer represents the 1s and high pointer represents the 2s.
 * 3. If the mid pointer is 0, swap the mid and low pointers and increment both. If the mid pointer is 2, 
 * swap the mid and high pointers and decrement the high pointer. If the mid pointer is 1, increment the mid pointer.
 */

class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int low=0, mid=0, high = n-1;

        while(mid <= high){
            if(nums[mid] == 0){
                swap(nums, mid, low);
                low++;
                mid++;
            }else if(nums[mid] == 2){
                swap(nums, mid, high);
                high--;
            }else {
                mid++;
            }
        }
    }

    private void swap(int[] nums, int i, int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}