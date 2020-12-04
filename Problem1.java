// Problem 75 leet
// Time Complexity : O(N)
// Space Complexity : O(1)
// It runs successfully on Leetcode


class Solution {
    public void sortColors(int[] nums) {
        if( nums == null || nums.length == 0){
            return;
        }
        int low = 0, mid = 0 , high = nums.length - 1;
        while(mid <= high)
        {
            if(nums[mid] == 0){
                swap(low, mid, nums);
                low++;
                mid++;
            }
            else if(nums[mid] == 1){
                mid++;
            }
            else{
                swap(high, mid, nums);
                high--;
            }
        }
        
    }
    
    private void swap(int i, int j, int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}