// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
package problem3;

public class ContainerWithMostWater {
	public int maxArea(int[] height) {
		int n = height.length;
		if (n == 0 || n == 1) {
			return n;
		}

		int maxArea = 0;
		int i = 0, j = n - 1;
		while (i < j) {
			maxArea = Math.max(maxArea, Math.min(height[i], height[j]) * (j - i));
			if (height[i] < height[j]) {
				i++;
			} else {
				j--;
			}
		}
		return maxArea;
	}

	public static void main(String[] args) {
		ContainerWithMostWater obj = new ContainerWithMostWater();
		int[] height = { 4, 8, 6, 2, 5, 4, 8, 3, 7 };
		System.out.println("Container with most water area: " + obj.maxArea(height));
	}

}
