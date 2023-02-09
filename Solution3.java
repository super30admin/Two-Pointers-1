// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
 * I set two pointers, one at the start of the list and the other at the end. Current area is calculated as minimum of height[i] & height[j] * (j-i). I compare current area with max area and if
 * it's bigger, I set max area to current area. If height[i] < height[j], I increment i else if height[i]>height[j] i decrement j. Else If both are equal, I increment both.
 */
class Solution3 {
    public int maxArea(int[] height) {
        int i=0,j=height.length-1;
        int max = 0;
        while(i<j)
        {
            int currentArea = Math.min(height[i],height[j]) * (j-i);
            max = Math.max(currentArea,max);
            if(height[i]<height[j])
            {
                i++;
            }
            else if(height[j]<height[i])
            {
                j--;
            }
            else
            {
                i++;
                j--;
            }
        }
        return max;
    }
}