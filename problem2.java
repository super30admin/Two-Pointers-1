// Time Complexity : O(n^2)
// Space Complexity : O(1)  (excluding output list)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Avoiding duplicates is the main tricky part.


// Your code here along with comments explaining your approach in three sentences only
// First I sort the array, then fix one number and use two pointers to find pairs that make sum zero.
// When the sum is too small I move left pointer, when too large I move right pointer, and when zero I store the triplet.
// I skip duplicates for i, left, and right so output does not repeat.

import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {

            if (i > 0 && nums[i] == nums[i - 1]) continue; // skip duplicate i

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {

                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;

                    // skip duplicates on left
                    while (left < right && nums[left] == nums[left - 1]) left++;

                    // skip duplicates on right
                    while (left < right && nums[right] == nums[right + 1]) right--;

                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return res;
    }
}
