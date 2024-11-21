
// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes 
// Any problem you faced while coding this : No
import java.util.Arrays;

public class Container_With_Most_Water {
	/*
	 * In this function we assign our low to 0th index and high to the last index,
	 * and at each iteration we calculate the area, and accordingly manipulate our
	 * max. In the end we check if the height at the low index is lesser than height
	 * at high index, if so we increment our low index, else we decrement our high
	 * index. We Keep on Iterating till low and high are adjacent to each other
	 */
	public static int maxArea(int[] height) {
		if (height == null || height.length < 2) {
			return 0;
		}
		int max = 0;
		int low = 0;
		int high = height.length - 1;
		while (low < high) {
			int curr = (high - low) * Math.min(height[low], height[high]);
			max = Math.max(curr, max);
			if (height[low] < height[high]) {
				low++;
			} else {
				high--;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int height[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
		int max_area = maxArea(height);
		System.out.println(Arrays.toString(height));
		System.out.println("Maximum Area: " + max_area);
	}
}