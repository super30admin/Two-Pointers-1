// Time Complexity : O(N x N) as we have two nested loops. 
//We will need this as we need to find all possible combinations after sorting.

// Space Complexity : O(1) as we are using 2 pointers. 
                //The list we are returning, hence it is not auxillary.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : It was hard to come up with 
                                        //the intuition of sorting.

import java.util.*;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums == null || nums.length == 0) {
            return new ArrayList<>();
        }
        
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        
        for(int i = 0 ; i < nums.length - 2; i++) {
            if(i != 0 && nums[i-1] == nums[i]) {
                continue;
            }
            
            int left = i + 1;
            int right = nums.length - 1;
            
            while(left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                
                if(sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;

                    while(left < right && nums[left] == nums[left-1]) {
                        left++;
                    }

                    while(left < right && nums[right] == nums[right+1]) {
                        right--;
                    }
                } else if (sum < 0) {
                    left++;
                    while(left < right && nums[left] == nums[left-1]) {
                        left++;
                    }
                } else {
                    right--;
                    while(left < right && nums[right] == nums[right+1]) {
                        right--;
                    }
                }
            }
        }
        return result;
    }
}
