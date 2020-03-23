// Time Complexity : O(n^2) where n is the length of the array nums
// Space Complexity : O(n) where n is the length of the array nums
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach

class 3Sum {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> ans = new HashSet<>(); 
        if (nums.length < 3) return new ArrayList<>(ans);
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                } 
                else if (sum > 0) {
                    k--;
                } 
                else if (sum < 0) {
                    j++;
                }
            }
        }
        return new ArrayList<>(ans);
    }
}