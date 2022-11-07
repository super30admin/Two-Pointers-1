//Time complexity is O(n^2) and sc is O(n)
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        int x = 0;
        int n = nums.length;
        Arrays.sort(nums);

        while (x < n) {
            int left = x + 1, right = n - 1;

            while (left < right) {
                int sum = nums[x] + nums[left] + nums[right];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[x], nums[left], nums[right]));
                }
                if (sum > 0) {
                    --right;
                    while (left < right && nums[right] == nums[right + 1])
                        --right;
                } else {
                    ++left;
                    while (left < right && nums[left] == nums[left - 1])
                        ++left;

                }

            }
            ++x;
            while (x < n && nums[x] == nums[x - 1])
                ++x;

        }
        return result;
    }
}