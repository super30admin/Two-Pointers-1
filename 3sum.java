class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int target=0;
        for(int k=0;k<n-2;k++){
            int i=k+1,j=n-1;
            if(k!=0 && nums[k]==nums[k-1]) continue;
            while(i<j){
                int sum=nums[k]+nums[i]+nums[j];
                if(sum==target){               
                    res.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    i++;j--;
                    while(i<j && nums[i]==nums[i-1]) i++;
                    while(i<j && nums[j]==nums[j+1]) j--;
                }
                else if(sum<target){
                    i++;
                }
                else{
                    j--;
                }
            }
        }
        return res;
    }
}
