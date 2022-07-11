// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

class Solution {
    public void sortColors(int[] nums) {
        if(nums == null || nums.length==0){
            return;
        }
        int low = 0,mid =0;
        int high = nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                swap(nums,low,mid);
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else {
                swap(nums,mid,high);
                high--;
            }
        }
    }
    void swap(int[] nums,int i,int j){
        if(i!=j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
}