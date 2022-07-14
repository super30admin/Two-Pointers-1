class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){
            if (i > 0 && nums[i] == nums[i - 1]){
                continue;
            }
            int l=i+1,r=nums.length-1;
            int sum=0;
            while(l<r){
                sum = nums[i]+nums[l]+nums[r];
                if(sum==0){
                    res.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    l++;
                    while(nums[l]==nums[l-1] && l<r){
                        l++;
                    }
                    r--;
                    while(nums[r]==nums[r+1] && l<r){
                        r--;
                    }
                }
                else if(sum < 0){
                    l++;
                    while(nums[l]==nums[l-1] && l<r){
                        l++;
                    }
                }
                else{
                    r--;
                    while(nums[r]==nums[r+1] && l<r){
                        r--;
                    }
                }
            }
        }
        
        return res;
    }
}