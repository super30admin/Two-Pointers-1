// Time Complexity :o(n)
// Space Complexity :o(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
class Solution {
    public int maxArea(int[] height) {
        int low = 0;
        int high = height.length -1;
        int area = 0;
        while(low<high)
        {
            area = Math.max(area, (Math.min(height[low], height[high]) * (high-low)));
            if(height[low] <= height[high])
            {
                low++;
            }
            else
                high--;
        }
        return area;
    }
}