// Time Complexity : O(N/2) where N is the length of the nums array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

class Solution {
    public void sortColors(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int curr = 0;
//      Using 3 pointers
        while(curr <= right){
             if(nums[curr] == 2){
                 swap(nums, curr, right);
                 right--;
             }
            else if(nums[curr] == 0){
                swap(nums, curr, left);
                curr++;
                left++;
            }
            else if(nums[curr] == 1)
                curr++;
        }     
    }

    private void swap(int[]nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}