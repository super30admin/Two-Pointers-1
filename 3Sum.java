// Time Complexity : O(nlog n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach


class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums == null || nums.length == 0)return new ArrayList<>(); 
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length - 1;

        for(int i = 0; i < nums.length;i++){
            if(i > 0 && nums[i] == nums[i-1])continue;
            int low = i+1;
            int high = n;
            int sum = 0 - nums[i];
            while(low < high){
                if(nums[low] + nums[high] == sum){
                    ans.add(Arrays.asList(nums[i], nums[low], nums[high]));
                    low++;
                    while(low <= n && nums[low] == nums[low-1])low++;
                    high--;
                    while(high >= 0 && nums[high] == nums[high + 1])high--;
                }
                else if(nums[low] + nums[high] < sum){
                    low++;
                }else{
                    high--;
                }
            }
        }
        return ans;
    }
} 