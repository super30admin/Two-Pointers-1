// Time Complexity : O(n) where n is number of elements in array.
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :

class Solution {
    public void sortColors(int[] nums) {
        if(nums == null|| nums.length == 0) return;

        int low = 0, mid = 0, high = nums.length -1;

        while(mid<=high) {
            if(nums[mid] == 2) {
                swap(nums, mid, high);
                high --;
            } else if(nums[mid] == 0) {
                swap(nums, mid, low);
                low++;
                mid++;
            } else {
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