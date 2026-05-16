// Time Complexity : O(n) where n is the total length of height array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

public class Solution {
    public int MaxArea(int[] height) {
        int low = 0, high = height.Length - 1;
        int maxArea = 0;

        while(low<=high)
        {
            int minHeight = Math.Min(height[low], height[high]);
            maxArea = Math.Max(maxArea, minHeight * (high-low));

            if(height[low] < height[high])
            {
                low++;
            }

            else
            {
                high--;
            }
        }

        return maxArea;
    }
}