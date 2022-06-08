// Time Complexity :O(n^2)
// Space Complexity :O(1)

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length && nums[i] <= 0; ++i)
            if (i == 0 || nums[i - 1] != nums[i]) {
                twoSum(nums, i, result);
            }
        return result;
        }
        void twoSum(int[] nums, int i, List<List<Integer>> result) {
        int low = i + 1, high = nums.length - 1;
        while (low< high) {
            int sum = nums[i] + nums[low] + nums[high];
            if (sum < 0) {
                ++low;
            } else if (sum > 0) {
                --high;
            } else {
                result.add(Arrays.asList(nums[i], nums[low++], nums[high--]));
                while (nums[low] == nums[low - 1] &&low < high )
                    ++low;
            }
        }
    }
} 
© 2022 GitHub, Inc.