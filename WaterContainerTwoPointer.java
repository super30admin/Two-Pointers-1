// TC - O(N)
// SC - O(1)

// Constraints:
// n == height.length
// 2 <= n <= 10^5
// 0 <= height[i] <= 10^4

public class WaterContainerTwoPointer {
    class Solution {
        public int maxArea(int[] height) {
            int max = Integer.MIN_VALUE;
            int left = 0;
            int right = height.length - 1;
            while (left < right) {
                int currHeight = Math.min(height[left], height[right]);
                int currWidth = right - left;
                int currArea = currHeight * currWidth;
                max = Math.max(max, currArea);
                if (height[left] == height[right]) {
                    left++;
                    right--;
                } else if (height[left] < height[right]) {
                    left++;
                } else {
                    right--;
                }
            }
            return max;
        }
    }
}