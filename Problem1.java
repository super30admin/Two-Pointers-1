// Time Complexity : O(N)
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : Yes

//Problem statement: https://leetcode.com/problems/sort-colors/

class Problem1 {

    public void sortColors(int[] nums) {

        int mid = 0;
        int low = 0;
        int high = nums.length - 1;

        if(nums == null || nums.length == 0){
            return;
        }

        while(mid <= high){
            if(nums[mid] == 0){
                swap(nums, mid, low);
                low++;
                mid++;
            }else if(nums[mid] == 1){
                mid++;
            }else{
                swap(nums, mid, high);
                high--;
            }
        }

    }

    private void swap(int[] nums, int idx1, int idx2){
        int temp = nums[idx1];
        nums[idx1] = nums[idx2];
        nums[idx2] = temp;
    }
}
