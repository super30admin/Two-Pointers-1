/* Approach: the idea over here is that the area is dependent on 2 things, height and the width.
1. We start with the max width possible. And we keep moving out height range. We move away from the index that has shorter height. 
2. When the heights are same, either move left or right
3. This way, the comparisions are reduced. As every element is not compared to every element.

Time complexity: O(N)
Space complexity: O(1)
*/
class Solution {
    public int maxArea(int[] height) {
       int i=0; int j=height.length-1;
       int area=0;
       while(i<=j)
       {
           if(height[i]<=height[j])
           {
               area = Math.max(area, height[i]*(j-i));
               i++;
           }
           else
           {
               area = Math.max(area, height[j]*(j-i));
               j--;
           }
       }
      return area; 
    }
}