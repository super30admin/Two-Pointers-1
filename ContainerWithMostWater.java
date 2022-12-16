
//Time Complexity :O(N))
//Space Complexity : O(1)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this :yes
public class ContainerWithMostWater {
	
	public int maxArea(int[] height) {
	      
	      int left = 0;
	      int right = height.length-1;
	      int maxArea = Integer.MIN_VALUE;
	       
	      while(left < right){
	          maxArea = Math.max(maxArea,Math.min(height[left],height[right]) * (right-left));
	          if(height[left] < height[right]){
	              left++;
	          }else{
	              right--;
	          }
	          
	      }
	      return maxArea;
	    }
}
