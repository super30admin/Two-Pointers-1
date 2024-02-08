//TimeComplexity : O(n)
//Space Complexity : O(1)

class Solution {
    void swap (int []nums, int value1, int value2) {
        int temp;
        temp = nums[value1];
        nums[value1] = nums[value2];
        nums[value2] = temp;
    }
    public void sortColors(int[] nums) {
        int low =0; 
        int high = nums.length-1;
        int mid =0;
        for(int i =0; i<nums.length;i++) {
            if(nums[mid] == 2) {
                swap(nums, mid, high);
                 high--;
            } else if(nums[mid] == 0) {
                swap(nums, low, mid);
                mid++;
                low++;
            } else {
               mid++;
            }
        }
    }
}