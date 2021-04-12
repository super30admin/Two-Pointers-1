// Time Complexity : O(n^2) 
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :
class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums == null || nums.length < 3) return new ArrayList();
        List<List<Integer>> result= new ArrayList();
        Arrays.sort(nums);
        
        for(int i=0; i<nums.length-2;i++){
            if(i>0 && nums[i] == nums[i-1]) continue;
            int lo = i+1, hi = nums.length-1;
            while(lo<hi){
                int sum = nums[i] + nums[lo] + nums[hi];
                if(sum == 0){
                    result.add(Arrays.asList(nums[i], nums[lo], nums[hi]));
                    while(hi>0 && nums[hi] == nums[hi-1]) hi--;
                    while(lo < nums.length-1 && nums[lo] == nums[lo+1]) lo++;
                    lo++;
                    hi--;
                    
                }else if(sum<0){
                    lo++;
                }else{
                    //sum>0
                    hi--;
                }
            }
        }
        
        return result;
     }
}