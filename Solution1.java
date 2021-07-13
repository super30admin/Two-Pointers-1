// Time complexity: O(N), where N is the length of nums array. 
// Space complexity: O(1)
// Did this code successfully run on Leetcode : Yes

class Solution1 {
    public void sortColors(int[] nums) {
        // maintain 3 points, start for 0, end for 2, i for 1.
        int start=0, end=nums.length-1;
        for(int i=0; i<=end; ) {
            if(nums[i] == 0) {
                int temp = nums[start];
                nums[start++] = nums[i];
                nums[i] = temp;
                i++;
            }
            else if(nums[i] == 2) {
                int temp = nums[end]; 
                nums[end--] = nums[i]; 
                nums[i] = temp;
            }
            else i++; 
        }
    }
}