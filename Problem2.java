// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : Intiution

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                int l = i + 1, r = nums.length - 1;

                while (l < r) {
                    int sum = nums[i] + nums[l] + nums[r];
                    
                    if (sum < 0) {
                        l++;
                    } else if (sum > 0) {
                        r--;
                    } else {
                        result.add(Arrays.asList(nums[i], nums[l], nums[r]));
                        l++;
                        r--;
                        while (l < r && nums[l] == nums[l - 1]) l++;
                        while (l < r && nums[r] == nums[r + 1]) r--;
                    }
                }
            }
        }

        return result;
    }
}
