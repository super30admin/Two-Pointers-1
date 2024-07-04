// Time Complexity : O(nlog n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       List<List<Integer>> res = new ArrayList<>();
       int n = nums.length;
       Arrays.sort(nums);

       for(int i=0;i<n;i++){
        if(i!=0 && nums[i]==nums[i-1])continue;

        int l = i+1;
        int r = n-1;

        while(l<r){
            if(nums[i]+nums[l]+nums[r]==0){
                res.add(Arrays.asList(nums[i],nums[l],nums[r]));
                l++;
                r--;

                while(l<r && nums[l]==nums[l-1]){
                    l++;
                }
                while(l<r && nums[r]==nums[r+1]){
                    r--;
                }
            }else if(nums[i]+nums[l]+nums[r]<0){
               l++;
            }else{
                 r--;
            }
        }
       } 
       return res;
    }
}