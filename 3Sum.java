// Time Complexity : O(NlogN)[Sorting] + O(N^2)[Iteration + Two Pointer] => O(N^2)
// Space Complexity : O(1) :: we do not use any extra space here
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this :

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();
        if (nums.length == 0) return ans;

        // sort the numbers first to avoid duplicates
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {

            // To avoid duplicates
            if (i == 0 || nums[i - 1] != nums[i]) {

                int lo = i + 1;
                int hi = nums.length - 1;
                int sum = 0 - nums[i];

                // ther are sorted :: use two pointer
                while (lo < hi) {

                    if (nums[lo] + nums[hi] < sum) lo++;
                    else if (nums[lo] + nums[hi] > sum) hi--;
                    else {
                        // we got the answer
                        ans.add(Arrays.asList(nums[i], nums[lo], nums[hi]));

                        // avoid duplicates
                        while (lo < hi && nums[lo] == nums[lo + 1]) lo++;
                        while (lo < hi && nums[hi] == nums[hi - 1]) hi--;

                        // u are on the edges :: Increase one more time to get unique lo and hi value
                        lo++;
                        hi--;

                    }

                }

            }

        }

        return ans;
    }
}