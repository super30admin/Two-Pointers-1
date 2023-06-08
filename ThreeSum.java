// ## Problem2 (https://leetcode.com/problems/3sum/)
// Time Complexity : O(n logn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : NO

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int sum;
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < nums.length && nums[i] <= 0; i++) {
            // Checking outer duplicacy, inwards will be checked inside
            if (i == 0 || nums[i] != nums[i - 1]) {
                int left = i + 1, right = nums.length - 1;
                while (left < right) {
                    sum = nums[i] + nums[left] + nums[right];
                    if (sum == 0) {
                        ans.add(Arrays.asList(nums[i], nums[left], nums[right]));
                        left++;
                        right--;
                        // Will only be able to manage internal duplicacy
                        while (left < right && nums[left] == nums[left - 1]) {
                            left++;
                        }
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
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] input = { -1, 0, 1, 2, -1, -4 };
        ThreeSum obj = new ThreeSum();
        System.out.println("Output: " + obj.threeSum(input));
    }
}
