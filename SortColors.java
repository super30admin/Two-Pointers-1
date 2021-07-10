// Time Complexity : O(N) N-> No of integers in array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
class SortColors {
    public void sortColors(int[] nums) {
        int low = 0, mid =0, high = nums.length - 1;

        // Iterate until mid doesn't cross high
        while(mid <= high) {
            if(nums[mid] == 0) {
                swap(low, mid, nums);
                low++;
                mid++;
            } else if( nums[mid] == 1) {
                mid++;
            } else {
                swap(mid, high, nums);
                high--;
            }
        }
    }

    // swap function
    private void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}