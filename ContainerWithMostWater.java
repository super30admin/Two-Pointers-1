// Time Complexity :O(N)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach
// I have used a two pointer approach here where thers is a left pointer and a right pointer.We record the area under the graph
// and as we iterate towards the middle of the array we keep updating the max if we see a greater area.
// The left pointer is moved to the right when the height is less than the high element and if heigh at high is greater we bring the right pointer
// towards the middle of the array. We keep updating the max as we move.
class Solution {
    public int maxArea(int[] height) {
      
      if(height == null || height.length==0)
        return 0;
      int l = 0;
      int h = height.length-1;
      int max = Integer.MIN_VALUE;
      while(l <= h)
      {
        max = Math.max(max,(h-l)*Math.min(height[l],height[h]));
        if(height[l]<=height[h])
        {
          l++;
          
        }
        else
        {
          h--;
        }
      }
        return max;
    }
}