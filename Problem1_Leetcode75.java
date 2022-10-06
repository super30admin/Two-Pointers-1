// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// TC: O(n)
// SC: O(1)

class Solution {
    public void sortColors(int[] nums) {

        if(nums == null || nums.length == 0) return;

        int low = 0, mid = 0;
        int high = nums.length - 1;

        // loop to move low
        while(mid <= high) {
            if(nums[mid] == 2) {
                swap(nums, mid, high);
                high--;
            }
            else if(nums[mid] == 0) {
                swap(nums, mid, low);
                low++;
                mid++;
            }
            else {
                mid++;
            }
        }

        return;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

