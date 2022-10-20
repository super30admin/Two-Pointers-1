class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        int x = 0;
        
        while(x<n){
            int l=x+1;
            int r=n-1;
            while(l<r){
                int s = nums[x]+nums[l]+nums[r];
                if(s==0){
                    ans.add(Arrays.asList(nums[x],nums[l],nums[r]));
                }
                if(s<=0){
                    ++l;
                    while(l<r && nums[l]==nums[l-1])++l;
                }else{
                    --r;
                    while(l<r && nums[r]==nums[r+1])--r;
                }
            }
            ++x;
            while(x<n && nums[x]==nums[x-1])++x;
        }
        return ans;
    }
}
//tc:O(n^2)
//sc:O(1)
