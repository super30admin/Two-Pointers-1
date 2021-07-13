// Time complexity: O(N^2), where N is the length of nums array. 
// Space complexity: O(1)
// Did this code successfully run on Leetcode : Yes

import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> output = new ArrayList<>(); 
        if(nums == null || nums.length < 2) 
            return output; 
        
        // sort the array
        Arrays.sort(nums); 
        
        for (int i = 0; i < nums.length; i++) {
            // check for duplicate pivots
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            // two pointers 
            int low=i+1, high=nums.length-1;
            while(low < high) {
                int sum = nums[i] + nums[low] + nums[high];
                if(sum == 0) {
                    output.add(Arrays.asList(nums[i], nums[low], nums[high])); 
                    low++;
                    high--;
                    // check for duplicates
                    while(low < high && nums[low] == nums[low-1]) low++; 
                    while(low < high && nums[high] == nums[high+1]) high--; 
                }
                else if(sum > 0) {
                    high--;
                }
                else {
                    low++; 
                }
            }
        }
        
        return output; 
    }
}