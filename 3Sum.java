// Time Complexity : O(N2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : N/A

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int l = i + 1;
            int r = n - 1;

            while (l < r) {
                int currSum = nums[i] + nums[l] + nums[r];

                if (currSum == 0) {
                    List<Integer> li = new ArrayList<>();
                    li.add(nums[i]);
                    li.add(nums[l]);
                    li.add(nums[r]);
                    res.add(li);
                    l++;
                    r--;

                    while (l != n - 1 && nums[l] == nums[l - 1]) {
                        l++;
                    }

                    while (r != 0 && nums[r] == nums[r + 1]) {
                        r--;
                    }

                } else if (currSum > 0) {
                    r--;
                } else {
                    l++;
                }
            }

        }
        return res;
    }
}