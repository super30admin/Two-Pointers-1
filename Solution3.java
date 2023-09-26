//Leetcode Problem : https://leetcode.com/problems/container-with-most-water/description/
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
 * Set low as 0 and high as nums.length-1. While low<high, I set length = min of height[low] and height[high]. And calculate
 * area as max of previous area and new area given as length*(height-low). If height[low]<height[high], I increment low. Else 
 * I decrement high.
 */

class Solution {
    public int maxArea(int[] height) {
        int low = 0, high = height.length-1;
        int area = 0;
        while(low<high)
        {
            int x = Math.min(height[low],height[high]);
            area=Math.max(area,x*(high-low));
            if(height[low]<height[high])
            {
                low++;
            }
            else
            {
                high--;
            }
        }


        return area;
    }
}