// TC: O(n)
// SC: O(1)
// Approach: 
// 1. Consider two pointers left and right
// 2. Find min between left and right and calculate area
// 3. Have global max, compare the area with global max using Math.max()
// 4. Move the left pointer if height[left] is smaller than height[right]
// 5. Else move right pointer
// 6. Return max 

public class ContainerWithMostWater {

  public int maxArea(int[] height) {
    int left = 0;
    int right = height.length - 1;
    int max = Integer.MIN_VALUE;

    while (left < right) {
      int maxArea = Math.min(height[left], height[right]) * (right - left);
      max = Math.max(max, maxArea);
      if (height[left] < height[right]) {
        left++;
      } else {
        right--;
      }
    }
    return max;
  }

  public static void main(String[] args) {
    ContainerWithMostWater c = new ContainerWithMostWater();
    int[] height = new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 };

    System.out.println(c.maxArea(height));
  }
}