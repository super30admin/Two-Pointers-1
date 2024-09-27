// Time Complexity : O(N logN)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
3pointers approach

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length == 0) return new ArrayList<>();
        int len = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList();

        for (int i = 0; i < len; i++) {
            int left = i + 1, right = len - 1;
            //outer duplicates
            if (nums[i] > 0) break;
            if (i != 0 && nums[i] == nums[i - 1]) continue;
            while (left < right) {
                int sum = nums[left] + nums[right] + nums[i];
                if (sum > 0) {
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    List<Integer> list = Arrays.asList(nums[i], nums[left], nums[right]);
                    res.add(list);
                    left++;
                    right--;

                    //inner duplicates
                    while (left < right && nums[left] == nums[left - 1])
                        left++;
                    while (left < right && nums[right] == nums[right + 1])
                        right--;
                }

            }
        }
        return res;
    }
}