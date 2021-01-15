// Time Complexity : o(n)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : Yes
public class ContainerWithMostWater {

	public int maxArea(int[] height) {

		// edge case
		if (height == null || height.length == 0)
			return 0;

		int l = 0, h = height.length - 1;
		int maxArea = Integer.MIN_VALUE;
		while (l < h) {
			//store max area through traversal
			maxArea = Math.max(maxArea, Math.min(height[l], height[h]) * (h - l));
			// compare heights and move min value pointer
			if (height[l] <= height[h]) {
				l++;
			} else {
				h--;
			}
		}
		return maxArea;
	}

}
