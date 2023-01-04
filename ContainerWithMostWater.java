//Time Complexity : O(n)
//Space Complexity: O(1)
// Did this code successfully run on Leetcode : Yes

/**
 *  Have two pointers one at the first and one at the end. Keep making the rectange and
 *  compute the maximum area for each indexes
 */

public class ContainerWithMostWater {

  public int maxArea(int[] height) {
    //Consider the lowest value as max area
    int maximumArea = 0;
    //First and last pointers
    int first = 0;
    int last = height.length - 1;

    while(first < last) {
      // Compare the height between two indexes to determine the shorter bar
      // because the length of shorter bar is used to compute the maximum area
      int shorterBar = Math.min(height[first], height[last] );

      maximumArea = Math.max(maximumArea, shorterBar * (last - first));

      if(height[first] < height[last] ) {
        first ++;
      } else {
        last --;
      }
    }
    return maximumArea;
  }

  public static void main(String[] args) {
    ContainerWithMostWater cwmw = new ContainerWithMostWater();
    int[] height = {1,8,6,2,5,4,8,3,7};
    System.out.println(cwmw.maxArea(height));
  }
}
