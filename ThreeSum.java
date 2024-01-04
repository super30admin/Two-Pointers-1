
class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);

        if(nums[0] > 0) return result;

        for(int i = 0; i < n-2; i ++) {
            int l = i+1;
            int r = n-1;
            if(i != 0 && nums[i] == nums[i-1]) {
                continue;
            }
            while(l < r) {
                if(nums[i] + nums[l] + nums[r] == 0) {
                    result.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    l++;
                    r--;
                    while (l < r && nums[l] == nums[l-1]) l++;
                    while (l < r && nums[r] == nums[r+1]) r--;
                } else if(nums[i] + nums[l] + nums[r] < 0) {
                    l++;
                } else {
                    r--;
                }
            }

        }

        return result;
    }
}