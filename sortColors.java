// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach
class Solution {
    public void sortColors(int[] nums) {
        if(nums == null || nums.length == 0){
            return;
        }
        int low = 0, mid = 0, high = nums.length - 1;
        //traverse from till mid is equal to high 
        while(mid <= high){
            if(nums[mid] == 0){
                //if mid becoms 0 than swap low and mid
                swap(low, mid, nums);
                low++;
                mid++;
            }
            // if mid is 1 just increment mid and not low
            else if(nums[mid] == 1){
                mid++;
            }
            else{
                //if 2 is encountered just swap mid and high
                swap(high, mid, nums);
                high--;
            }
        }
    }
    private void swap(int i, int j, int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}