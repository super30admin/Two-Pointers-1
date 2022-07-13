// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
class Solution {
    public void sortColors(int[] nums) {
        int left = 0, right=nums.length-1;
        int mid = 0;
        while(mid<=right){
            if(nums[mid] == 1){
                mid++;
            }
            else if(nums[mid] == 0){
                swap(nums,left,mid);
                mid++;
                left++;
            }
            else if(nums[mid] == 2){
                swap(nums, right, mid);
                right--;
            }
        }
    }
    public void swap(int[] nums, int a, int b){
        int temp;
        temp = nums[a];
        nums[a]= nums[b];
        nums[b] =temp;
    }
}