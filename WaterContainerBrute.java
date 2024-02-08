// TC - O(N^2)
// SC - O(1)

// Constraints:
// n == height.length
// 2 <= n <= 10^5
// 0 <= height[i] <= 10^4

public class WaterContainerBrute {
    class Solution {
        public int maxArea(int[] height) {
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < height.length - 1; i++) {
                for (int j = i + 1; j < height.length; j++) {
                    int currHeight = Math.min(height[i], height[j]);
                    int currWidth = j - i;
                    int currArea = currHeight * currWidth;
                    max = Math.max(max, currArea);
                }
            }
            return max;
        }
    }
}