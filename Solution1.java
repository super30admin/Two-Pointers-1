// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
class Solution1 {
    public void sortColors(int[] nums) {
        if(nums == null || nums.length == 0){
            return;
        }
        int low = 0, high = nums.length - 1, mid = 0;
        while(mid <= high){
            if(nums[mid] == 2){
                swap(nums, mid, high);
                high--;
            }
            else if(nums[mid] == 1){
                mid++;
            }
            else {
                swap(nums, low, mid);
                low++;
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