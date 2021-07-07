/**
 * Time: O(n)
 * Space: O(1)
 * Leetcode accepted: yes
 * Problems faced: No
 */
public class ContainerWithMostWater {
	public static void main(String[] args) {
		int[] height = {1,8,6,2,5,4,8,3,7};
		System.out.println(maxArea(height));
	}

	private static int maxArea(int[] height) {
		int lo = 0, hi = height.length-1;
		int maxArea = 0;
		// Iterate until lo and hi cross each other
		while(lo < hi) {
			//Calculate area at every instance and compare it with maxArea
			maxArea = Math.max(maxArea, Math.min(height[lo], height[hi]) * (hi-lo));
			//As the width is decreasing, always skip the low pillar in order to obtain max area
			if(height[lo] <= height[hi]) {
				lo++;
			} else {
				hi--;
			}
		}
		return maxArea;
	}

}
