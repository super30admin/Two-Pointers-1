// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


class Solution {
    public int maxArea(int[] height) {
      //Bruteforce solution
      //edge case
      if(height == null || height.length == 0) {
        return 0;
      }
      
      int max = 0;
      int n = height.length;
      for(int i = 0; i< n-1; i++) {
        for(int j = i+1; j<n; j++) {
          //take two heights and get the area and compare with prev max
          max = Math.max(max, (j-i)*Math.min(height[i], height[j]));
        }
      }
        
      return max;
    }
}