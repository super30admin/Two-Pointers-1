// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public void sortColors(int[] nums) {
        if(nums == null || nums.length == 0)return;
        int low = 0;
        int high = nums.length -1;
        int index = 0;

        while (index <= high){
            if(nums[index] == 0){
                int temp = nums[low];
                nums[low] = nums[index];
                nums[index] = temp;
                low++;
                index++;
            }else if(nums[index] == 1){
                index++;
            }else{
                int temp = nums[index];
                nums[index] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }
} 