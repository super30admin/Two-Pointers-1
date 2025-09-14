// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None
class Solution {
    public void sortColors(int[] nums) {
        int low = 0, high = nums.length-1, mid = 0;

        while(mid <= high){
            if(nums[mid] == 2){
                swap(nums, mid, high);
                high--;
            }else if(nums[mid] == 0){
                swap(nums, mid, low);
                low++;
                mid++;
            }else{
                mid++;
            }
        }
    }

    private void swap(int[] nums, int x, int y){
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
}
