// Time Complexity : O(nlog(n) + n^2) -> O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Yes, had to go through the lecture again.

/*
 * Sort the nums - nlog(n)
 * for each elmenet try to find there is a matching 2 Sum
 * check for duplicates
 */

import java.util.*;

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {

            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right]; // to check if we have already checked for this sum
                if (i != 0 && nums[i] == nums[i - 1])
                    continue;
                if (nums[i] > 0)
                    break;
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;

                    // check if there are duplicates in left
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }

                    // check if there are duplicates in right
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return result;

    }
}