// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

//three pointers : low, mid and high and checking if mid is equal to 0,1 or 2 and swapping elements
class Solution {
    public void sortColors(int[] nums) {
        if(nums == null || nums.length == 0) return;
        int low = 0;
        int high = nums.length-1;
        int mid = 0;
        
        while(mid <= high){
            if(nums[mid] == 0){
                swap(nums, mid, low);
                low++;
                mid++;
            }
            else if(nums[mid] == 1){
                mid++;
            }
            else if(nums[mid] == 2){
                swap(nums, mid, high);
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