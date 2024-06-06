//time - O(n), space - O(1)
class Solution {
    public void sortColors(int[] nums) {
        if(nums==null || nums.length==0) return;
        int left = 0, mid = 0, right = nums.length-1;

        while(mid <= right){
            if(nums[mid] == 2){
                swap(nums, mid, right);
                right--;
            } else if(nums[mid] == 0) {
                swap(nums, mid, left);
                mid++;
                left++;
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