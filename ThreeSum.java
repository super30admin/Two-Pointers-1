package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
        public List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> result = new ArrayList<>();
            if (nums.length == 0) return result;

            Arrays.sort(nums);

            for (int i = 0; i + 2 < nums.length; i++) {
                if (i > 0 && nums[i] == nums[i - 1]) {
                    continue;
                }
                int o = i + 1;
                int q = nums.length - 1;
                int target = -nums[i];
                while (o < q) {
                    if (nums[o] + nums[q] == target) {
                        result.add(Arrays.asList(nums[i], nums[o], nums[q]));
                        o++;
                        q--;
                        while (o < q && nums[o] == nums[o - 1]) {
                            o++;
                        }
                        while (o < q && nums[q] == nums[q + 1]) {
                            q--;
                        }
                    } else if (nums[o] + nums[q] > target) {
                        q--;
                    } else {
                        o++;
                    }
                }
            }
            return result;
        }
}
