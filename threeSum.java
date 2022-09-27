class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length < 3)
            return new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            if (i>0 && nums[i] == nums[i-1]) continue;
            if(nums[i] > 0) break;
            int left = i+1;
            int right = n-1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    List<Integer> li = Arrays.asList(nums[i], nums[left], nums[right]);
                    result.add(li);
                    left++;
                    right--;
                    while (left < right && nums[left] == nums[left-1])
                        left++;
                    while (left < right && nums[right] == nums[right+1])
                        right--;
                }
                else if (sum < 0)
                    left++;
                else
                    right--;
            }
        }
        return result;
    }
}