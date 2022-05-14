class Solution {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        //edge
        if (nums == null || nums.length == 0) {
            return result;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int complement = -1 * nums[i];
            while (left < right) {
                if (nums[left] + nums[right] < complement) {
                    left++;
                } else if (nums[left] + nums[right] > complement) {
                    right--;
                } else if (nums[left] + nums[right] == complement) {
                    List<Integer> list =
                            Arrays.asList(nums[i], nums[left], nums[right]);
                    result.add(list);
                    left++;
                    right--;
                    while (left < right && nums[left - 1] == nums[left]) left++;
                    while (left < right && nums[right +1] == nums[right]) right--;
                }
            }
        }
        return result;
    }
}
