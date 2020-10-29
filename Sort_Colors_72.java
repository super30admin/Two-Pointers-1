//Time Complexity : O(n)
//Space Complexity : O(1)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : None

package com.s30.satish;

class Sort_Colors_72 {
    public void sortColors(int[] nums) {
    	if(nums == null || nums.length == 0)
        	return;
    	
    	int low = 0, mid = 0, high = nums.length-1;
    	while(mid <= high)
    	{
    		if(nums[mid] == 1)
    			mid++;
    		else if(nums[mid] == 2)
    		{
    			swap(nums, mid, high);
    			high--;
    		}
    		else
    		{
    			swap(nums, mid, low);
    			low++;
    			mid++;
    		}
    		
    	}
    }	
	void swap(int[] nums, int a, int b)
	{
		int temp = nums[a];
		nums[a] = nums[b];
		nums[b] = temp;
	}
	
	// Method-2
    	
//    	int start = 0, end = nums.length-1;
//    	
//    	for(int i = 0; i < nums.length && start < end; i++)
//    	{
//	    	if(nums[i] == 0)
//	    	{
//		    	while(start < nums.length && nums[start] == 0)
//		    		start++;
//		    	if(i > start)
//		    	{
//		    		int temp = nums[i];
//		    		nums[i] = nums[start];
//		    		nums[start] = temp;
//		    		start++;
//		    	}
//	    	}
//	    	else if(nums[i]==2)
//	    	{
//		    	while(end >= 0 && nums[end] == 2)
//		    		end--;
//		    	if(i < end)
//		    	{
//		    		int temp = nums[i];
//		    		nums[i] = nums[end];
//		    		nums[end] = temp;
//		    		end--;
//		    		i--;
//		    	}	
//	    	}
//    	}

	// Method-3     
        /*if(nums == null || nums.length == 0)
        	return;

        int zeros = 0;
        int ones = 0;
        int twos = 0;
        
        for(int i = 0; i < nums.length; i++)
        {
        	if(nums[i] == 0)
        		zeros++;
        	else if(nums[i] == 1)
        		ones++;
        	else
        		twos++;
        }
        
        for(int idx = 0; idx < zeros; idx++)
        {
        	nums[idx] = 0;
        }
        for(int idx = zeros; idx < zeros+ones; idx++)
        {
        	nums[idx] = 1;
        }
        for(int idx = (zeros+ones); idx < zeros+ones+twos; idx++)
        {
        	nums[idx] = 2;
        }
        return; 
        */
    public static void main(String[] args)
    {
    		int[] nums = {2,0,2,1,1,0,1};
    		Sort_Colors_72 colors = new Sort_Colors_72();
    		colors.sortColors(nums);
    }
    
}
