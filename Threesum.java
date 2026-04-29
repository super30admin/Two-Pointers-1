// Time Complexity :O(N Log N) due to sorting, O(N^2) for the two pointer approach
// Space Complexity :O(N) for the result list but O(1) if we don't consider the output space
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach
// We will first sort the array to make it easier to avoid duplicates and use the two pointer approach.
// We will iterate through the array and for each element, we will use two pointers to find pairs that sum up to the negative of the current element.
// If we find a triplet that sums up to zero, we will add it to the result list and move both pointers while skipping duplicates.
// If the sum is less than zero, we will move the left pointer to increase the sum, and if the sum is greater than zero, we will move the right pointer to decrease the sum.
// This approach ensures that we are checking all possible triplets while maintaining a time complexity of O(N^2) and space complexity of O(N) for the result list.
import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        for (int target = 0; target < nums.length; target++) {

            // skip duplicates
            if (target > 0 && nums[target] == nums[target - 1]) {
                continue;
            }

            int left = target + 1;
            int right = nums.length - 1;

            while (left < right) {

                int sum = nums[target] + nums[left] + nums[right];

                if (sum == 0) {

                    res.add(Arrays.asList(nums[target], nums[left], nums[right]));

                    // skip duplicates
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;
                }
                else if (sum < 0) {
                    left++;
                }
                else {
                    right--;
                }
            }
        }

        return res;
    }
}