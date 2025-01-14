class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0; i<n; i++){
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            if(nums[i] > 0){
                continue;
            }
            int l = i+1;
            int r = n-1;
            while(l<r){
                int target = nums[i] + nums[l] + nums[r];
                if(target > 0){
                    r--;
                } else if (target < 0) {
                    l++;
                } else {
                    result.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    l++;
                    r--;
                    while(l<=r && nums[l-1] == nums[l]){
                        l++;
                    }
                    while(l<=r && nums[r] == nums[r+1]){
                        r--;
                    }
                }
            }
        }

        return result;
    }
}
