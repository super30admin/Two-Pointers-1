
/**
 * Take two pointers left and right. Take the min of them
 * and multiply with diff of their indices. Update max value
 * if the current product is maximum. Then to move pointers,
 * we check if the left pointer height is less than right pointer
 * height. If so do l++, else h--;
 *
 */
class Solution {
	public int maxArea(int[] height) {
		int l = 0, h = height.length - 1;
		int max = 0;
		while (l < h) {
			int min = Math.min(height[l], height[h]);
			max = Math.max(max, (h - l) * min);
			if (height[l] < height[h])
				l++;
			else
				h--;
		}
		return max;
	}
}