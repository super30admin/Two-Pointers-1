//TC: O(n)
//SC: O(1)
public class MaximumWater {

  public int maxArea(int[] height) {

    int min = 0;
    int w = 0;
    int area = 0;

    int l = 0;
    int h = height.length - 1;

    while (l < h) {

      min = Math.min(height[h], height[l]);
      w = h - l;
      area = Math.max(area, w * min);

      if (height[h] > height[l]) {
        l++;
      } else {
        h--;
      }
    }

    return area;

  }

}
