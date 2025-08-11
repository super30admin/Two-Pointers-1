## Problem2 (https://leetcode.com/problems/3sum/)

// Time Complexity : O(n^2)
// Space Complexity : O(1) excluding the result list;
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :
// - Skipping duplicates correctly for i, l, and r to avoid repeated triplets
// - Remembering the early break when nums[i] > 0
// - Ensuring pointers move past all duplicates after a match

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums); // Sort to enable two-pointer technique and handle duplicates
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            // Skip duplicate 
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            // If the smallest number is > 0, all sums will be > 0, so stop early
            if (nums[i] > 0) break;

            int target = -nums[i];
            int l = i + 1, r = n - 1;

            while (l < r) {
                int sum = nums[l] + nums[r];
                if (sum == target) {
                    res.add(Arrays.asList(nums[i], nums[l], nums[r]));

                    // Move both pointers past duplicates
                    int leftVal = nums[l], rightVal = nums[r];
                    while (l < r && nums[l] == leftVal) l++;
                    while (l < r && nums[r] == rightVal) r--;
                } else if (sum < target) {
                    l++; // Need a larger sum
                } else {
                    r--; // Need a smaller sum
                }
            }
        }
        return res;
    }
}
