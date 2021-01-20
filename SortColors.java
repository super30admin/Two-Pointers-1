
// Time Complexity : O(n)
// Space Complexity : O(1) Inplace manipulation of data in nums.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// 3 pointer approach

class Solution {
    public void sortColors(int[] nums) {
        if(nums == null || nums.length == 0) return;

        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while(mid <= high) {
            if(nums[mid] == 1)  {
                mid++;
            }
            else if(nums[mid] == 2) { // This places '2' at the correct position in the output (end of result)
                int temp = nums[high];
                nums[high] = nums[mid];
                nums[mid] = temp;

                high--;
            } else if(nums[mid] == 0) {
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;

                mid++;
                low++;
            }
        }
    }
}
