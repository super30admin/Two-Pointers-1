// Time Complexity :  O(N^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No


class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       //edge case 
        if(nums == null || nums.length == 0) return new ArrayList<>();
        // if(nums.length == 3) return nums;
        List<List<Integer>> set = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 2; i++){
            if(nums[i]>0) break;
            if(i>0 && nums[i] == nums[i-1]) continue;
            int low = i + 1;
            int high = nums.length - 1;
            
            while(low < high){
                int sum = nums[i] + nums[low] + nums[high];
                if(sum == 0){
                    set.add(Arrays.asList(nums[i], nums[low], nums[high]));
                    low++;high--;
                    while(low < high && nums[low] == nums[low -1]) low++;
                    while(low < high && nums[high] == nums[high+ 1]) high--;
                }
                else if(sum < 0){
                    low++;
                }else{
                    high--;
                }
            }
        }
        return set;
    }
}