// Time Complexity : O(nums.length)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
class SortColors {

    // Time Complexity = O(nums.length)
    // Space Complexity = O(1)
    public void sortColors(int[] nums) {
        int mid = 0; // it will be colelcting 1s
        int high = nums.length - 1; // it will be collecting 2s, so it will start from end
        int low = 0; // it will be collecting 0s

        while(mid <= high) {
            if(nums[mid] == 0){
                swap(nums, mid, low);
                low++;
                mid++;
            } else if(nums[mid] == 2){
                // if it is 2 swap with high
                swap(nums, mid, high);
                high--;
            } else{
                // it is already 1, so just increment mid as it should be collecting 1s
                mid++;
            }
        }
    }
    private void swap(int[] nums, int i, int j){
        if(i != j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
}