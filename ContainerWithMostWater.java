public class ContainerWithMostWater {
    // Using Brute force technique [O(n^2)]
    // public int maxArea(int[] height) {
    // int max = 0;
    // for (int i = 0; i < height.length; i++) {
    // for (int j = i + 1; j < height.length; j++) {
    // max = Integer.max(max, Integer.min(height[i], height[j]) * (j - i));
    // }
    // }
    // return max;
    // }

    public int maxArea(int[] height) {
        int max = 0;
        int l = 0;
        int r = height.length - 1;
        while (l < r) {
            max = Integer.max(max, Integer.min(height[l], height[r]) * (r - l));
            if (height[l] <= height[r]) {
                l++;
            } else {
                r--;
            }
        }
        return max;
    }
}
