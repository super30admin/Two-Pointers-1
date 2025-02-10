package sum3;

import java.util.*;

// Time Complexity : O(n^2)
// Space Complexity : O(n^2)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

public class Efficient {

    public static void main(String[] args) {

//        int[] nums = {-1,0,1,2,-1,-4};
//        int[] nums = {0,1,1};
        int[] nums = {0,0,0};
        System.out.println(threeSum(nums));
    }

    public static List<List<Integer>> threeSum(int[] nums) {

        if (nums == null || nums.length < 3) {
            return new ArrayList();
        }

        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList();

        for (int i = 0; i < n - 2; i++) {

            // to avoid duplicates

            // -1 -1 -1 0 1 2
            if (i > 0 && nums[i - 1] == nums[i]) {
                continue;
            }

            int left = i + 1;
            int right = n - 1;

            while(left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if(sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // to avoid duplicates
                    while(left < right  && nums[left] == nums[left + 1]) {
                        left++;
                    }

                    while(right > left && nums[right] == nums[right - 1]) {
                        right--;
                    }

                    left++;
                    right--;

                } else if(sum > 0) {
                    right--;
                } else {
                    left++;
                }
            }
        }

        return result;
    }
}
