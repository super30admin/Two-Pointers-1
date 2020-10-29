//Time Complexity : O(n^2)
//Space Complexity : O(1)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : None

package com.s30.satish;

import java.util.*;

class Three_Sum_15 {
    public List<List<Integer>> threeSum(int[] nums) {
    	List<List<Integer>> result = new ArrayList<>();
        
    	if(nums == null || nums.length == 0)
        	return result;
    	Arrays.sort(nums);
        int n = nums.length;
        for(int i = 0; i < n-2; i++)
        {
        	if(nums[i] > 0)
        		break;
        	if(i > 0 && nums[i] == nums[i-1])
        		continue;
        	int low = i+1;
        	int high = n-1;
        	
        	while(low < high)
        	{
        		int sum = nums[i] + nums[low] + nums[high];
        		if(sum == 0)
        		{
        			result.add(Arrays.asList(nums[i],nums[low],nums[high]));
        			low++;
        			high--;
        			while(low < high && nums[low] == nums[low-1])
        				low++;
        			while(low < high && nums[high] == nums[high+1])
        				high--;
        		}
        		else if(sum < 0)
        			low++;
        		else
        			high--;		
        	}
        }
        
        return result;
    }
    
    public static void main(String[] args)
    {
    		int[] arr = {1,4,-1,0,0,-1,2,-1,-4};
    		Three_Sum_15 sumOfThrees = new Three_Sum_15();
    		List<List<Integer>> result = sumOfThrees.threeSum(arr);
    		for(List i:result)
    			System.out.println(i);
    }
}
