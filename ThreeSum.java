// Time Complexity : O(N^2)
// Space Complexity : O(1), using only result array
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
// We observe that we need to find unique triplets that sum to 0. So we should sort the input array, so that we can avoid
// considering duplicate values in the result. For finding the triplets, we can have three pointers, one for fixing at
// one value and other two for traversing the rest of the array to search for 2 values so that all three sum to 0.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        int len = nums.length;
        if (len == 0) return result;

        Arrays.sort(nums);

        for (int i = 0; i < len - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;            // skip finding the result for same number
            }

            int start = i + 1;
            int end = len - 1;

            while (start < end) {
                int sum = nums[i] + nums[start] + nums[end];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[start], nums[end]));
                    while (start < end && nums[start] == nums[start + 1]) start++;
                    while (start < end && nums[end] == nums[end - 1]) end--;
                    start++;
                    end--;
                } else if (sum > 0) {
                    end--;
                } else {
                    start++;
                }


            }
        }

        return result;
    }
}
