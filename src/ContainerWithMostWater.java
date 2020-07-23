// Time Complexity :brute force O(n^2), 2 pointer O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
/**
 * https://leetcode.com/problems/container-with-most-water/
 * Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water.

   Note: You may not slant the container and n is at least 2.

   2 pointer Strategy: area = width * Math.min(height[low],height[high]), here if we move low or high, width surely decreasing, so we have to maximize the height, 
   height is constrained by min height due to min function. so lets move away from min height container. i.e. move low or high pointer.
 *
 */
public class ContainerWithMostWater {

	//brute force o(n^2) 
	public int maxArea(int[] height) {

		if(height == null || height.length ==0) return 0;
		int n = height.length, max = 0;

		//check for every pair
		for(int i=0; i< n-1; i++) {
			for(int j=i+1; j< n; j++) {
				//width = i-j, effective height - min height of from both containers
				int currArea = (j-i) * Math.min(height[i], height[j]);
				max = Math.max(max, currArea);
			}
		}
		return max;
	}

	//2 pointer O(n) solution
	public int maxArea2(int[] height) {

		if(height == null || height.length ==0) return 0;
		int n = height.length, max = 0;

		int low = 0, high = n-1;

		while(low < high) {
			int currArea = (high - low) * Math.min(height[low], height[high]);
			max = Math.max(max, currArea);

			//move away from container which has lower height
			if(height[low] < height[high]) 
				low++; 
			else 
				high--;
		} 
		return max;
	}
}
