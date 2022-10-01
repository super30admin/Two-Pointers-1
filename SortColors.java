// Time Complexity :O(N)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode: Yes
// Any problem you faced while coding this:No

class Solution {
    public void sortColors(int[] nums) {
        if(nums == null || nums.length == 0)
            return;
        int high = nums.length - 1;
        int low = 0;
        int mid = 0;
        while(mid <= high){
            if(nums[mid] == 2){
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
            else if(nums[mid] == 0){
                int temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;
                low++;
                mid++;
            }
            else{
                mid++;
            }
        }
    }
}
