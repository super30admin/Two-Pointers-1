// Time Complexity :O(nlogn)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no


class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0; i < n; i++){
            if(i != 0 && nums[i] == nums[i-1]) continue;
            if(nums[i] > 0) break;
            int low= i+1; int high= n-1;
            while(low < high){
                int sum = nums[i]+nums[low]+nums[high];
                if(sum == 0){
                    result.add(Arrays.asList(nums[i],nums[low],nums[high]));
                    low++;
                    high--;
                    while(low<=high && nums[low] == nums[low - 1]){
                        low++;
                    }
                    while(low<=high && nums[high] == nums[high + 1]){
                        high--;
                    }
                } else if(sum > 0){
                    high--;
                }else{
                    low++;
                }
            }
        }
        return result;
    }
}