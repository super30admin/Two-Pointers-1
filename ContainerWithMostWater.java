// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Approach: take two pointers, i and j. i starts from left
// and j starts from right. At every point, we calculate the 
// area and store the max area in max. 
// In order to maximize the are, if height of i is smaller than j,
//  we move i one step towards right, else we move j towards left. 

// LC- 11. Container with most water

public class ContainerWithMostWater {
  public int maxArea(int[] height) {
    if (height == null || height.length == 0) {
      return 0;
    }

    int max = 0, i = 0, j = height.length - 1;

    while (i < j) {
      int smallerHeight = Math.min(height[i], height[j]);
      max = Math.max(max, (j - i) * (smallerHeight));

      if (height[i] < height[j]) {
        i++;
      } else {
        j--;
      }
    }
    return max;
  }
}
