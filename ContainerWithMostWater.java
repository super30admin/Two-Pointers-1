/*
* Time Complexity: O(N)
* Space Complexity: O(1)
* */
public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        if (height.length == 0 || height == null) {
            return 0;
        }

        int left = 0;
        int right = height.length - 1;
        int max = 0;

        while (left < right) {
            int h = Math.min(height[left], height[right]);
            max = Math.max(max, h * (right - left));
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }
}
