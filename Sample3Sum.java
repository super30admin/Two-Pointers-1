// Time Complexity : O(n*n)
// Space Complexity : (1)
// Did this code successfully run on Leetcode :yes

class Sample3Sum{
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for(int i=0 ; i<n-2; i++){
            if(nums[i]>0) break; // If nums becomes greater than 0 then we wont get zero sum.
            if(i>0 && nums[i]==nums[i-1]) continue; // Checking duplicacy.
            int l = i+1;
            int r = n-1;
            while(l<r){
                int sum = nums[i] + nums[l] + nums[r]    
                if(sum==0){
                    list<Integer> li = Arrays.asList(nums[i],nums[l], nums[r]);
                    res.add(li);
                    l++;r--;
                    //Internal Duplicacy.
                    while(l<r && nums[l]==nums[l-1]) l++;
                    while(l<r && nums[r]==nums[r+1]) r--;
                }else if(sum<0){
                    l++;    
                }else{
                    r--;
                }
            }

        }
        return res;
    }
}