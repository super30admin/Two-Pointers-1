// Time Complexity : O(nlogn) + O(n^2) => O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
// Sort the array. Fix one index and apply two sum. The two sum technique
// with sorted array allows to find the target in O(n).

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            // avoid duplicate triplets
            if (i != 0 && nums[i] == nums[i - 1])
                continue;
            // need to find a sum which when added to nums[i] makes 0
            int target = nums[i] * -1;
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                if (nums[left] + nums[right] > target) {
                    right--;
                } else if (nums[left] + nums[right] < target) {
                    left++;
                } else {
                    // found one triplet
                    res.add(new ArrayList<>(Arrays.asList(nums[left], nums[right], nums[i])));
                    left++;
                    right--;
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                }
            }
        }
        return res;
    }
}