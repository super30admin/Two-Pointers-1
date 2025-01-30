// TC = O(n)
// SC = O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void sortColors(int[] nums) {
        // null
        if(nums == null || nums.length == 0) return;
        int low = 0, mid = 0, high = nums.length - 1;
        while(mid <= high) {
            if(nums[mid] == 0) {       // low is collecting 0 
                swap(nums, mid, low);
                low++; mid++;
            }
            else if(nums[mid] == 2) {   // high is collecting 2
                swap(nums, mid, high);
                high--;
            }
            else mid++;                 // mid is collecting 1
        }
    }
}