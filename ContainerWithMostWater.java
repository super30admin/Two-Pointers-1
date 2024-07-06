// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
  public int maxArea(int[] height) {
    int left = 0;
    int right = height.length-1;
    int maxWater = 0;
    while(left<right) {
      // Updating max Area.
      maxWater = Math.max(maxWater, (right-left)*(Math.min(height[left], height[right])));
      // Updating pointers: moving the smaller one
      if(height[left]<height[right]) left++;
      else right--;
    }
    return maxWater;
  }
}