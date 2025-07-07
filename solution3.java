//TC=O(n);
//sc=O(1);
public class solution3 {
	public int maxArea(int[] height) {
	    int left = 0, right = height.length - 1;
	    int maxArea = 0;

	    while (left < right) {
	        int h = Math.min(height[left], height[right]);
	        int w = right - left;
	        maxArea = Math.max(maxArea, h * w);

	        // Move the shorter wall
	        if (height[left] < height[right]) {
	            left++;
	        } else {
	            right--;
	        }
	    }

	    return maxArea;
	}
}
