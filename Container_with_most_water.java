
public class Container_with_most_water {
	//Approach: 1. Area is found by height* distance. Hence, we use two pointer approach to find maximum area. we start at extreme edges so not to miss any tuples. 
	//2. we calculate area at every low and high positions and update the max variable if necessary. 
	//3. Of the 2 numbers at low and high, we move the one with lesser height.
	 public int maxArea(int[] height) {
	        int low = 0, high = height.length-1;
	        int maxArea = 0;
	        while(low < high)
	        {
	            int min = Math.min(height[low], height[high]);
	            maxArea = Math.max(maxArea, min * (high - low));
	            if(height[low] < height[high])
	                low++;
	            else
	                high--;
	        }
	        return maxArea;
	    }
}
//Time Complexity : O(n) 
//Space Complexity : O(1) 
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this :