// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


class Solution {
    public int maxArea(int[] height) {

        int area=0, i=0, j=height.length-1;

        while(i<j) {

            area = Math.max(area, Math.min(height[i],height[j])*(j-i));

            if(height[i] <= height[j])
                i++;
            else
                j--;

        }

        return area;

    }
}
