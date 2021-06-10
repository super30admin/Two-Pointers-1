// Time Complexity : O(N*N) 
// Space Complexity : O(log N) //for quick sort 
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

/**
 * 1. Sort the array to do similar to two sum.
 * 2. do a for loop on sorted array and call two sum for each element which is <=0.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

	class Solution {
	    public List<List<Integer>> threeSum(int[] nums) {
	    	if(nums.length<3) return new ArrayList<>();
	    	
	        Arrays.sort(nums);
	        
	        List<List<Integer>> res = new ArrayList<>();
	        
	        //after sort nums[i] is positive number we don't need to check right side of array
	        for (int i = 0; i < nums.length && nums[i] <= 0; i++)
	        	//outer duplicates
	            if (i == 0 || nums[i - 1] != nums[i]) {
	                twoSum(nums, i, res);
	            }
	        return res;
	    }
	    void twoSum(int[] nums, int index, List<List<Integer>> res) {
	        int leftp = index + 1;
	        int rightp = nums.length - 1;
	        while (leftp < rightp) {
	            int sum = nums[index] + nums[leftp] + nums[rightp];
	            if (sum < 0) {
	                ++leftp;
	            } else if (sum > 0) {
	            	rightp--;
	            } else {
	                res.add(Arrays.asList(nums[index], nums[leftp++], nums[rightp--]));
	                
	                //inner duplicates
	                while (leftp < rightp && nums[leftp] == nums[leftp - 1])
	                    leftp++;
	            }
	        }
	    }
	}
}
