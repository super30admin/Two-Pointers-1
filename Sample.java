// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
class Solution {
    public void sortColors(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        int low = 0, curr = 0, high = nums.length - 1;

        while (curr <= high) {
            if (nums[curr] == 0) {
                // Swap nums[curr] and nums[low]
                int temp = nums[curr];
                nums[curr] = nums[low];
                nums[low] = temp;
                low++;
                curr++;
            } else if (nums[curr] == 2) {
                // Swap nums[curr] and nums[high]
                int temp = nums[curr];
                nums[curr] = nums[high];
                nums[high] = temp;
                high--;
            } else {
                curr++;
            }
        }
    }
}

////////////////////
/// 