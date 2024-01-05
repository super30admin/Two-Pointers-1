//Time complexity o(n^2)
//Sapce complexity o(1)
class Problem2 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0; i<n-2; i++) {
            if(i!=0 && nums[i]==nums[i-1]){
                continue;
            }
            int l = i+1, r = n-1;
            while(l<r) {
                int currSum = nums[i] + nums[l] + nums[r];
                if(currSum == 0){
                    result.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    l++;
                    r--;
                    while(l<r && nums[l] == nums[l-1]){
                        l++;
                    }
                    while(l<r && nums[r] == nums[r+1]){
                        r--;
                    }
                } else if(currSum < 0){
                    l++;
                } else {
                    r--;
                }
            }
        }
        return result;
    }
}
