// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

import java.util.*;

class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        
        if(nums == null || nums.length == 0) return new ArrayList<>();
        
        
        Arrays.sort(nums);
        
        List<List<Integer>> result = new ArrayList<>();
        
        for(int i = 0; i < nums.length; i++) {
            
            if(i > 0 && nums[i] == nums[i-1]) continue;

            int left = i + 1;
            int right = nums.length - 1;

            while(left < right) {

                int sum = nums[left] + nums[right] + nums[i];
                if(sum == 0) {
                    result.add(new ArrayList<>(List.of(nums[i], nums[left], nums[right])));
                    
                    while(left < right && nums[left] == nums[left+1]) {
                        left++;
                    }
                    
                    while(left < right && nums[right] == nums[right-1]) {
                        right--;
                    }
                }
                if(sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return result;
    }
}