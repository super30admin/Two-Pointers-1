//Time Complexity : O(n)
//Space Complexity : O(1)
//Code run successfully on LeetCode.

public class Problem3 {

	 public int maxArea(int[] height) {
		 
		 if(height == null || height.length == 0)
			 return -1;
		 
		 int left = 0;
		 int right = height.length - 1;
		 int max = Integer.MIN_VALUE;
		 
		 while(left < right) {
			 
			 max = Math.max(max, Math.min(height[left], height[right]) * (right -left));
			 
			 if(height[left] < height[right])
				 left++;
			 else if(height[right] < height[left])
				 right--;
			 
			 else {
				  left++;
				  right--;
			 } 
		 }
	      return max;  
	    }
}
