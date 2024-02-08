//TimeComplexity:O(n)
class Solution {
    public int maxArea(int[] height) {
        int low = 0;
        int high = height.length-1;
        int area = Integer.MIN_VALUE;
       while(low < high) { 
          if(area < Math.min(height[low],height[high]) * (high-low)) {
              area = Math.min(height[low],height[high]) * (high-low);
          }
              if(height[low] < height[high]) {
                  low++;
              } else {
                  high--;
              }
          }
       return area;
      }

    }
