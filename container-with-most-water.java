// Time - O(N)
// Complexity - O(1)

class Solution {
    public int maxArea(int[] height) {
        if(height == null || height == 0) {
          return 0;
        }
        int max = 0;
        int i=0, j = height.length - 1;

        while(i<j) {
          max = Math.max(max, (j-i) * Math.min(height[j], height[i]));
          if(height[j] < height[i]) {
            j--;
          }
          else {
            i++;
          }
        }
        return max;
    }
}
