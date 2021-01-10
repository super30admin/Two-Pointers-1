/* 
 * Complexity of algorithm is O(n) n is number of elements.
 *  
 * */
public class ContainerWithMostWater {

	public int maxArea(int[] height) {

		if (height == null || height.length == 0)
			return 0;

		int max = 0;
		int low = 0;
		int high = height.length - 1;

		while (low < high) {

			max = Math.max(max, Math.min(height[low], height[high]) * (high - low));

			if (height[low] <= height[high]) {
				low++;
			} else {
				high--;
			}
		}

		return max;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };

		ContainerWithMostWater objIn = new ContainerWithMostWater();

		System.out.println(objIn.maxArea(height));

	}

}
