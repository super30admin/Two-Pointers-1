//Time Complexity is O(N) as we are manipulating only the low and high pointer
//Space complexity is O(1) as we are not using any extra space
//This solution is submitted on Leetcode

public class MaximumWaterAreaoptimalSolutionBigN35 {
	public int maxArea(int[] height) {
		int max = 0;
		// edge
		if (height == null || height.length == 0)
			return max;
		int low = 0;
		int high = height.length - 1;
		while (low < high) {
			max = Math.max(max, (Math.min(height[low], height[high]) * (high - low)));
			if (height[low] < height[high])
				low++;
			else
				high--;
		}
		return max;
	}
}
