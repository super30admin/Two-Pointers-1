public class ContainersBruteForce {
	public int maxArea(int[] height) {

		if (height.length == 0 || height == null) {
			return 0;
		}
		int maxVal = 0;
		for (int i = 0; i < height.length - 1; i++) {
			for (int j = i + 1; j < height.length; j++) {
				maxVal = Math.max(maxVal, Math.min(height[i], height[j]) * (j - i)); //area is calculate
			}
		}
		return maxVal;

	}
}
