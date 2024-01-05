public class ContainerWithMostWater {
    // TC: O(N) where N is length of array
    // SC: O(1)
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int res = Integer.MIN_VALUE;
        while (left < right) {
            int width = right - left;
            int minHeight = Math.min(height[left], height[right]);
            res = Math.max(res, width * minHeight);
            if (height[left] < height[right]) {
                int currNum = height[left];
                while (left < right && height[left] <= currNum) {
                    left++;
                }
            } else {
                int currNum = height[right];
                while (left < right && height[right] <= currNum) {
                    right--;
                }
            }
        }
        return res;
    }
}
