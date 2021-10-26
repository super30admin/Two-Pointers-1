// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

public class ContainerWithMostWater {
	 public int maxArea(int[] height) {
	        int left=0;
	        int right=height.length-1;
	        int max=0;
	        while(left<right){
	           int curr=Math.min(height[left],height[right])*(right-left);
	            max=Math.max(max,curr);
	            if(height[left]>height[right]){
	                right--;
	            }else{
	                left++;
	            }
	        }
	        return max;
	 }
}
