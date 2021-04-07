// Time Complexity : O(N^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums == null || nums.length <3){
            return new ArrayList<>();
        }
        Arrays.sort(nums);
        int pivot = -1;
        int start = -1;
        int end = -1;
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < nums.length-2 ; i++){
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            pivot = i;
            start = i+1;
            end = nums.length-1;
            while(start < end){
                int total = nums[pivot]+nums[start]+nums[end];
                if(total == 0){
                    result.add(Arrays.asList(nums[pivot],nums[start],nums[end]));
                    start++;
                    end--;
                    while(start <end && nums[start] == nums[start-1]){
                        start++;
                    }
                    while(start < end && nums[end] == nums[end+1]){
                        end--;
                    }
                }else if(total < 0){
                    start++;
                    
                }else{
                    end--;
                    
                    
                }
            }
        }
        return result;
    }
}
