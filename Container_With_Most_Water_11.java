//Time Complexity : O(n)
//Space Complexity : O(1)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : None

package com.s30.satish;

class Container_With_Most_Water_11 {
    public int maxArea(int[] height) {
    	if(height == null || height.length == 0)
    		return 0;
        int result = 0;
        int low = 0;
        int high = height.length - 1;
        while(low < high)
        {
        	if(height[low] < height[high])
        	{
        		result = Math.max(result, (height[low] * (high - low)));
        		low++;
        	}
        	else
        	{
        		result = Math.max(result, (height[high] * (high - low)));
        		high--;
        	}
        }
    	return result;
    }
    
    public static void main(String[] args)
    {
    		int[] arr = {1,8,6,2,5,4,8,3,7};
    		Container_With_Most_Water_11 container = new Container_With_Most_Water_11();
    		System.out.println(container.maxArea(arr));
    }
}
