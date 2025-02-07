// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// find maximum area between to extreme pointers and moving the pointers inward based on the
// heights at the left and right pointers.

class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < n - 2; i++) {
            if (nums[i] > 0) break;
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            int l = i+1, r = n - 1;
            while (l < r) {
                int curr = nums[i] + nums[l] + nums[r];
                if(curr == 0) {
                    result.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    l++;
                    r--;
                    while (l < r && nums[l] == nums[l - 1]) {
                        l++;
                    }
                    while (l < r && nums[r] == nums[r + 1]) {
                        r--;
                    }
                } else if (curr > 0) {
                    r--;
                } else {
                    l++;
                }
            }
        }
        return result;
    }
}
