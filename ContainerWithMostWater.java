// Time Complexity: O(n)
// Space Complexity: O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

public class ContainerWithMostWater {
  public int maxArea(int[] height) {
    if (height == null || height.length < 2) {
      return 0;
    }
    int max = Integer.MIN_VALUE;
    int left = 0;
    int right = height.length - 1;
    while (left < right) {
      int minHeight = Math.min(height[left], height[right]);
      int currentArea = minHeight * (right - left);
      max = Math.max(max, currentArea);
      if (height[left] <= height[right]) {
        left++;
      } else {
        right--;
      }
    }
    return max;
  }
}
