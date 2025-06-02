// Approach:
// Sort the array first. Then fix one element at a time and use two pointers
// (start and end) to find pairs that sum to the negative of the fixed element.
// Skip duplicates to avoid repeating the same triplets in the result.
//
// Time Complexity : O(n^2) - Outer loop O(n), inner two-pointer loop O(n)
// Space Complexity : O(1) - Ignoring the output list
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums); // Sort the array to apply two-pointer technique
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            // Skip duplicate elements for the first number
            if (i != 0 && nums[i] == nums[i - 1])
                continue;

            int k = i + 1;
            int l = nums.length - 1;

            while (k < l) {
                int sum = nums[i] + nums[k] + nums[l];

                if (sum > 0)
                    l--; // Decrease right pointer
                else if (sum < 0)
                    k++; // Increase left pointer
                else {
                    // Triplet found
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[k]);
                    temp.add(nums[l]);
                    ans.add(temp);

                    // Move both pointers and skip duplicates
                    k++;
                    l--;

                    while (k < l && nums[k] == nums[k - 1])
                        k++;
                    while (k < l && nums[l] == nums[l + 1])
                        l--;
                }
            }
        }

        return ans;
    }
}
