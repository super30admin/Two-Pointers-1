// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach

class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;
        while(mid <= high){
            if(nums[mid] == 0){
                swap(mid, low, nums);
                low++;
                mid++;
            }
            else if(nums[mid] == 1){
                mid++;
                }
            else{
                swap(mid, high, nums);
                high--;
            }
            
        }
 }
    public void swap(int i, int j, int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;    
    }
}