public class ContainersUsingPointers {
	public int maxArea1(int[] height) {
		if (height.length == 0 || height == null) {
			return 0;

		}
		int low = 0;
		int high = height.length - 1;
		int max = 0;
		while (low < high) {
			if (height[low] < height[high]) {
				max = Math.max(max, height[low] * (high - low)); // max, area 
				low++;
			} else {
				max = Math.max(max, height[high] * (high - low));
				high--;
			}
		}

		return max;

	}
}
