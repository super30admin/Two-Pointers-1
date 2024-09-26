// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Approach: Using 3 pointers to collect each color in the array to sort it inplace
class Solution {
    public void sortColors(int[] nums) {
        if(nums == null || nums.length ==0){
            return;
        }
        int low =0, mid=0, high=nums.length-1;
        while(mid<=high){
            //Case 1
            if(nums[mid] == 0){
                swap(nums,low,mid);
                low++;
                mid++;
            }
            //Case 2
            else if(nums[mid] == 1){
                mid++;
            }
            //Case 3
            else{
                swap(nums,mid,high);
                high--;
            }
        }
    }
    
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

