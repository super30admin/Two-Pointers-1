// Time Complexity : O(n^2)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : y
// Any problem you faced while coding this : n
class Solution {

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < nums.length && nums[i] <= 0; i++) {
            if (i == 0 || nums[i - 1] != nums[i]) {
                twoSum(nums, i, ans);
            }
        }
        
        return ans;
    }
      
    private void twoSum(int[] nums, int i, List<List<Integer>> ans) {
        
        Set<Integer> seen = new HashSet<>();
        
        for (int j = i + 1; j < nums.length; ++j) {
            int complement = -nums[i] - nums[j];
            if (seen.contains(complement)) {
                ans.add(Arrays.asList(nums[i], nums[j], complement));
                while (j + 1 < nums.length && nums[j] == nums[j + 1]) ++j;
            }
            seen.add(nums[j]);
        }
    }
}
