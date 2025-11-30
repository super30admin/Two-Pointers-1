// Time Complexity : O(n^2)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach
// First sort the array so duplicates can be skipped easily and two-pointer logic works.
// Fix one number at a time and use two pointers (j, k) to find pairs that sum to -nums[i].
// Skip duplicates for all three positions to ensure only unique triplets are added to the result.

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {

            // Skip duplicate nums[i]
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];

                if (sum == 0) {
                    output.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;

                    // Skip duplicates for j
                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }
                    // Skip duplicates for k
                    while (j < k && nums[k] == nums[k + 1]) {
                        k--;
                    }

                } else if (sum > 0) {
                    k--;
                } else {
                    j++;
                }
            }
        }

        return output;
    }
}