// TIME: O(N^2)
// SPACE: O(1)
// SUCCESS on LeetCode

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> output = new ArrayList<>();
        for (int i = 0; i < nums.length && nums[i] <= 0; i++) {
            if (i == 0 || nums[i-1] != nums[i]) {
                twoSum(nums, i, output);
            }
        }
        return output;
    }
    
    private void twoSum(int[] nums, int i, List<List<Integer>> res) {
        int low = i+1;
        int high = nums.length - 1;
        while(low < high) {
            int sum = nums[i] + nums[low] + nums[high];
            if (sum > 0) {
                high--;
            } else if (sum < 0) {
                low++;
            } else {
                res.add(Arrays.asList(nums[i], nums[low], nums[high]));
                low++;
                high--;
                while (low < high && nums[low] == nums[low-1]) {
                    low++;
                }
            }
        }
    }
}
