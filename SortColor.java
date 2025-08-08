// This code creates three pointer approach - low for tracking 0, mid for tracking 1's and high for tracking 2's. 
class Solution {
    public void sortColors(int[] nums) {
        int low = 0, mid =0, high = nums.length-1;
        while(mid<=high) {
            // If the mid element is 2 - simply move it to high pointer
            if(nums[mid]==2) {
                swap(nums, high, mid);
                high--;
            // If the mid element is 0 - swap with low element
            } else if(nums[mid]==0) {
                swap(nums, low, mid);
                // move both pointers 
                low++;
                mid++;
            // If the mid element is 1 - simply move the mid pointer
            } else {
                mid++;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
