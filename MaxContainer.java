// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes

public class MaxContainer {

	   public int maxArea(int[] height) {
	        if(height == null|| height.length ==0) return 0;
	        int max = 0;
	        int n = height.length;
	        int low = 0; 
	        int high = n-1;
	        while (low<high){
	            max = Math.max(max, (high - low) * Math.min(height[low],height[high]));
	            if(height[low] < height[high]){
	                low++;
	            } else{
	                high--;
	            }                             
	        }
	        return max; 
	    }
}
