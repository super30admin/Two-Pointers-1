import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Time Complexity : O(n^2)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Sort the array
// For every pivote we check with 2 sum approach if 3 sum is 0
// if sum less than 0, we move left
// if sum is greater than 0, we move right
// if sum is 0, we got our triplets (add it to result list)
// also avoiding duplicate triplets on pivote level and 2sum level by checking consecutive nums are equal or not
class Solution2 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        if (nums == null || nums.length == 0) {
            return result;
        }

        int n = nums.length;

        Arrays.sort(nums);
        // pivote
        for (int i = 0; i < n; i++) {
            // to avoid duplicate - pivote case
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            int left = i + 1, right = n - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    List<Integer> li = Arrays.asList(nums[i], nums[left], nums[right]);
                    result.add(li);
                    left++;
                    right--;

                    // to avoid duplicates - left/right case
                    while (left < right && nums[left] == nums[left - 1])
                        left++;
                    while (left < right && nums[right] == nums[right + 1])
                        right--;
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