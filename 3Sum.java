// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// 1: After sorting the array, we iteratively fix one element and use two pointers to calculate if the sum is equal to 0
// 2: If the sum is equal to 0, we add the elements at each pointer to the returned ArrayList. Else, we move the pointers accordingly.
// 3: We have handled duplicates accordingly
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < n - 2; i++) {
            // outside duplicacy
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            int l = i + 1;
            int r = n - 1;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (sum == 0) {
                    List<Integer> res = Arrays.asList(nums[i], nums[l], nums[r]);
                    result.add(res);
                    l++;
                    r--;
                    while (l < r && nums[l] == nums[l - 1])
                        l++;
                    while (l < r && nums[r] == nums[r + 1])
                        r--;
                } else if (sum > 0) {
                    r--;
                } else
                    l++;
            }

        }
        return result;
    }
}