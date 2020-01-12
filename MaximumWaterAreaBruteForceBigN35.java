//Time Complexity is O(N^2) as there are two loops
//Space complexity is O(1) as we are not using any extra space
//This solution is submitted on Leetcode

public class MaximumWaterAreaBruteForceBigN35 {
	public int maxArea(int[] height) {
		int max = 0;
		//edge case
		if (height == null || height.length ==0)
			return max;
		int len = height.length;
		for (int i = 0; i<len-1;i++) {
			for (int j = i+1; j<len;j++) {
				max =Math.max(max,(Math.min(height[i], height[j]))* (j-i));
			}
		}
		return max;
	}
}
