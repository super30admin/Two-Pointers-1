package day12_TwoPointers1;

/*
	Idea : 1. Take two pointers, one at start and one at end.
		   2. Check for minimum height among both of them and find maxArea.
		   3. To find the max area, shift pointer to left and right according to max-height and keep on updating the maxArea.  
	Time Complexity : O(n) where n is the number of heights in array
	Space Complexity : O(1) since constant space is used.
	Did this code successfully run on Leetcode : yes
	Any problem you faced while coding this : no
*/

public class ContainerWithMostWater {

	public static int maxArea(int[] height) {

		int maxArea = 0, left = 0, right = height.length - 1;
		while (left < right) {

			maxArea = Math.max(maxArea, Math.min(height[left], height[right]) * (right - left));
			if (height[left] < height[right]) {
				left++;
			} else
				right--;
		}
		return maxArea;

		// BRUTE FORCE
		// Time complexity : O(n^2) because we iterate over the whole array twice
		// Space complexity : O(1) because we used constant space.

		/*
		 * int maxArea = 0; 
		 * for(int i = 0; i < height.length - 1; i++) 
		 * { 
		 * 	for (int j = i + 1; j < height.length; j++) 
		 * 	{
		 * 		maxArea = Math.max(maxArea, Math.min(height[i], height[j]) * (j - i)); 
		 * 	} 
		 * }
		 * return maxArea;
		 */
	}

	public static void main(String[] args) {
		int height[] = { 5, 4, 1, 8, 2 };

		System.out.println("Maximum area is: " + maxArea(height));
	}
}
