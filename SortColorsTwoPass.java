// OnePass
// https://leetcode.com/submissions/detail/619030057/
// Time - O(n)
// Space - O(1) 

class Solution {
    public void sortColors(int[] nums) {
        
        int left = 0;
        int right = nums.length - 1;
        int mid = 0;
        
        while(mid <= right) {
            
            if(nums[mid] == 0) {
                swap(nums, left, mid);
                left++;
                mid++;
            }
            else if(nums[mid] == 1) {
                mid++;
            }
            else{
                swap(nums, mid, right);
                right--;
            }
        }
    }
    
    public void swap(int[] nums, int l , int r) {
        
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }
}