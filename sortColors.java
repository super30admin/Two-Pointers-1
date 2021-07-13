// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public void sortColors(int[] nums) {
        //base case to check if array is empty
        if(nums == null || nums.length == 0)
            return;
        
        int n = nums.length, low = 0, mid = 0, high = nums.length - 1;
        
        while(mid <= high){
            
            //case 1: when mid is 0 we swap with the lowest point
            if(nums[mid] == 0){
                swap(nums, low, mid);
                low++;
                mid++;
            }
            //case 2: when mis is 2, we swap with the highest
            else if(nums[mid] == 2){
                swap(nums, mid, high);
                high--;
            }
            //case 3: if it is 1 we just move forward
            else{
                mid++;
            }
        }
    }
    
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}