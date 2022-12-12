// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

public class Solution {
    public int MaxArea(int[] height) {
        if(height == null || height.Length == 0)
            return 0;

        int low = 0;
        int high = height.Length -1;
        int maxArea = 0;
        while(low < high)
        {
            var area = Math.Min(height[low], height[high]) * (high - low);
            maxArea = Math.Max(area, maxArea);
            if(height[low] <= height[high]) low++;
            else high--;
        }
        return maxArea;
    }
}
