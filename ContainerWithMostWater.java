// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*maintain two pointer l=0, h=last element. 
* when height[l]<height[h], then increment l
* when height[l]>height[h], then decrement h
* compute the max area by multiplying the minimum among the heights *  width (high - low)
*/


public class ContainerWithMostWater{
	
	public int maxArea(int[] height) {
		
		if(height==null || height.length==0) {
			return 0;
		}
		
		int max=Integer.MIN_VALUE;
		int low=0, high=height.length-1;
		
		while(low<high) {
			max = Math.max(max, Math.min(height[low], height[high])*(high-low));
			
			if(height[low]<height[high]) {
				low = low+1;
			}else{
				high = high-1;
			}			
		}
		return max;
	}
	
	public static void main(String[] args) {
		ContainerWithMostWater ob = new ContainerWithMostWater();
		int[] height = {1,8,6,2,5,4,8,3,7};
		System.out.println(ob.maxArea(height));
	}
}