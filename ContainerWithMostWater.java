// Time Complexity : O (n)
// Space Complexity : O (1)
// Did this code successfully run on Leetcode : Yes

/*
 * calculate and update the maxArea
 * move the shorter side (as the longer side is likely to contribute to maxArea
 * when decreasing the width)
 */
public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int maxArea = 0;
        while(l < r) {
            // calculate the maxArea
            maxArea = Math.max(maxArea, (r-l) * Math.min(height[l], height[r]));

            // move the shorter side
            if (height[l] < height[r]) l++;
            else r--;
        }
        return maxArea;
    }
}
