//tc: O(n)
//sc: O(1)
class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[mid] == 0) {
                swap(nums,mid,low);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                swap(nums,high,mid);
                high--;
            }
        }
    }

    private void swap(int nums[], int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}