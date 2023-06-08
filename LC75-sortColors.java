class Solution {
    public void sortColors(int[] nums) {

        // Dutch Flag Algorithm
        
        int l = 0; // ptr for 1
        int r = nums.length-1; // ptr for 2
        int mid = 0; // 

        while (mid<=r){
            if(nums[mid] == 2) {
                swap(nums, mid, r);
                r--;
            } else if (nums[mid] == 0) {
                swap(nums, mid, l);
                l++;
                mid++;
            } else {
                mid++;
            }
        }
    }

    void swap(int[] nums, int i, int j){
       int temp = nums[i];
       nums[i] = nums[j];
       nums[j] = temp;
    }
}