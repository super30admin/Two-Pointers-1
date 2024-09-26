//Time Complexity: O(N)
//Space complexity: O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
/**
 * Using Dutch Flag Algorithm, also know as ONE PASS Algorithm
 */
class Solution {
    public void sortColors(int[] nums) {
        if(nums == null || nums.length == 0)
            return;
        
        //initialize low, mid, high
        int low=0, mid=0, high = nums.length-1;
        
        while(mid <= high){
            //mid == 2
            if(nums[mid] == 2){
                swap(nums, mid, high);
                high--;
            }
            //mid == 0
            else if(nums[mid] == 0){
                swap(nums, low, mid);
                low++;
                mid++;
            }
            //mid == 1
            else {
                mid++;
            }
        }
        
    }
    
    //swapping two varaibles in the array
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
