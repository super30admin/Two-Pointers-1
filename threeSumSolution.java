// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

import java.util.*;

public class threeSumSolution {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new ArrayList<>();
        }

        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        int lP = 0; // Left Pointer
        int rP = 0; // Right Pointer

        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            lP = i + 1;
            rP = n - 1;
            while (lP < rP) {
                int sum = nums[i] + nums[lP] + nums[rP];
                if (sum < 0) {
                    lP++;
                } else if (sum > 0) {
                    rP--;
                } else {
                    result.add(Arrays.asList(nums[i], nums[lP], nums[rP]));
                    lP++;
                    rP--;
                    while (lP < rP && nums[lP] == nums[lP - 1]) {
                        lP++;
                    }
                    while (lP < rP && nums[rP] == nums[rP + 1]) {
                        rP--;
                    }
                }
            }
        }

        return result;

    }

    public static void main(String[] args) {
        int[] nums = { -1, 0, 1, 2, -1, -4 };
        threeSumSolution tss = new threeSumSolution();
        System.out.println(tss.threeSum(nums));
    }
}
