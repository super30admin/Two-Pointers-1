// Time Complexity : O(N^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums == null || nums.length < 3)
            return new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        
        Arrays.sort(nums);
        
        int i = 0;
        
        
        while(i <= nums.length - 2){
            int j = i+1;
            int k = nums.length - 1;
            while(j < k){
               if(nums[i] + nums[j] + nums[k] == 0)
                    res.add(new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[k])));
                if(nums[j] + nums[k] < -1 * nums[i]){
                    j++;
                  // increment j till nums[j-1] == nums[j]
                    while(j != nums.length && nums[j] == nums[j-1])
                        j++;
                }
                else{
                    k--;
                  // increment k till nums[k+1] == nums[k]
                    while(k != i && nums[k+1] == nums[k])
                        k--;
                } 
            }
            i++;
          // increment i till nums[i-1] == nums[i]
            while(i != nums.length - 1 && nums[i] == nums[i-1])
                i++;
        }
        return res;
    }
}
