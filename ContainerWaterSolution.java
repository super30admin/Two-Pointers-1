// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// I will be using 2 pointer approach.
// Where left is set to start index of array and right is set to last index of array
// On each ineration of the loop will be calculating area and check with max area, if better update.
public class ContainerWaterSolution {
    public int maxArea(int[] height) {
        if(height == null || height.length == 0) {
            return 0;
        }
        int left = 0;
        int right = height.length - 1;
        int maxArea = Integer.MIN_VALUE;
        while(left <= right) {
            int currentArea = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(maxArea, currentArea);
            if(height[left] < height[right]) {
                left += 1;
            } else {
                right -= 1;
            }
        }
        return maxArea;
    }
}