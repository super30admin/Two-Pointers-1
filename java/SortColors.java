// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
I am counting number of 0's and 1's and 2's and storing in 3 counters and then iterating the counters
and filling in that many places with corresponding number in the given array
 */

class Solution {
    public void sortColors(int[] nums) {
        if (nums == null || nums.length == 0) return;
        int count0 = 0, count1 = 0, count2 = 0;
        for (int num : nums) {
            if (num == 0)
                count0++;
            else if (num == 1)
                count1++;
            else
                count2++;
        }

        int i = 0;

        while (count0 > 0 && i < nums.length) {
            nums[i++] = 0;
            count0--;
        }
        while (count1 > 0 && i < nums.length) {
            nums[i++] = 1;
            count1--;
        }
        while (count2 > 0 && i < nums.length) {
            nums[i++] = 2;
            count2--;
        }

    }
}