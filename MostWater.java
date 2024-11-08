// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach- we have 2 pts now, at each point
// we will calculate the area and then move either left/right ptr based on whichever one is minimum.

/**
 *  MostWater : MostWater
 *
 * @author : Kavya Mandaliya
 * @version : 1.0 (Nov 08, 2024)
 * @since : 1.0 (Nov 08, 2024)
 *
 */
 public class MostWater {
 public int maxArea(int[] height) {
  int area = 0, maxArea = Integer.MIN_VALUE;
  int left = 0, right = height.length-1;
  while(left < right){
   int width = right - left;
   int len = Math.min(height[left],height[right]);
   area = len * width;
   maxArea = Math.max(maxArea,area);

   if(height[left] < height[right]) left++;
   else right--;
  }
  return maxArea;
 }

}
