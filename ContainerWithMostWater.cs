// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
public class Solution {
    public int MaxArea(int[] height) {

        int left = 0;
        int right = height.Length - 1;
        int maxArea = 0;

        while (left < right) {
            // Calculate the current area
            int width = right - left;
            int h = Math.Min(height[left], height[right]);
            int area = h * width;

            // Update the max area
            maxArea = Math.Max(maxArea, area);

            // Move the pointer that points to the shorter line
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
        
    }
}