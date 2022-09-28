// TC : O(n^2)
// SC : O(1)
class Solution {
    private List<List<Integer>> res;
    private int n;
    public List<List<Integer>> threeSum(int[] nums) {
        this.res = new ArrayList<>();
        this.n = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                break;
            }
            if (i != 0 && nums[i] == nums[i - 1]) { //remove duplicate
                continue;
            }
            int target = -nums[i];
            findTwoSum(nums, i, target);
        }
        return res;
    }
    public void findTwoSum(int[] nums, int start, int target) {
        int left = start + 1;
        int right = n - 1;
        while (left < right) {
            int curr = nums[left] + nums[right];
            if (curr > target) {
                right--;
            } else if (curr < target) {
                left++;
            } else {
                res.add(List.of(nums[start], nums[left], nums[right]));
                left++;
                right--;
                while (right > left && nums[left] == nums[left - 1]) {
                    left++;
                }
            }
        }
    }
}
