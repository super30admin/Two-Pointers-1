// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// Take two pointers starting from left and other from right. 
// Max area can be calculated by taking minimum of height of left index and right index * length. This can be done in 1-pass.
class ContainerMostWaterSolution {
  public int maxArea(int[] height) {
    if(height==null || height.length==0)
      return 0;
    int i=0, j=height.length-1;
    int maxArea = 0;
    while(i<j) {
      int leftH = height[i];
      int rightH = height[j];
      maxArea = Math.max(maxArea, Math.min(leftH, rightH)*(j-i));
      if(leftH<rightH) {
        i++;
      } else {
        j--;
      }
    }
    return maxArea;
  }
}