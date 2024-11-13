//75. Sort Colors - https://leetcode.com/problems/sort-colors/description/
//Time Complexity: O(n)
//Space Complexity: O(1)

class Solution {

    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void sortColors(int[] nums) {
        //base case
        if(nums == null || nums.length == 0){
            return;
        }
        int n = nums.length;
        int low = 0; int mid = 0; int high = n-1;
        while(mid <= high){
            if(nums[mid] == 1){
                mid++;
            } else if(nums[mid] == 2){
                swap(nums,mid,high);
                high--;
            } else {
                swap(nums,mid,low);
                low++;
                mid++;
            }
        }
    }
}