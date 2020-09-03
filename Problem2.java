// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : 
// 1 approach - sort the array, initially mark 0 and 1
// positions as i and j and sum = i + j = 0 
// find sum in the rest of the array using binary search

// Here using 2 pointer approach

// Your code here along with comments explaining your approach

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        if(nums == null || nums.length == 0) return new ArrayList<>();
        
        Arrays.sort(nums);
        
        List<List<Integer>> result = new ArrayList<>();
        
        // if we don't have 3 values to compare and 
        // calculate sum we can't find a triplet
        // hence length - 2
        for(int i = 0; i < nums.length - 2; i++) {
            
            // duplicate values just increment i
            if(i != 0 && nums[i - 1] == nums[i]) continue;
            
            // left == right is not possible
            int left = i + 1;
            int right = nums.length - 1;
            
            // Finding triplets
            while(left < right) {
                
                int currSum = nums[i] + nums[left] + nums[right];
                
                if(currSum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    
                    left++;
                    while(left < right && nums[left] == nums[left - 1]) left++;
                    
                    right--;
                    while(left < right && nums[right] == nums[right + 1]) right--;
                    
                } else if(currSum < 0) {
                    left++;
                    while(left < right && nums[left] == nums[left - 1]) left++;
                } else {
                    right--;
                    while(left < right && nums[right] == nums[right + 1]) right--;
                }
            }
        }
        return result;
    }
}