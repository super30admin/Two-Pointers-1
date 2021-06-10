/**
 * @author Vishal Puri
 * // Time Complexity : O(n)
 * // Space Complexity : O(1)
 * // Did this code successfully run on Leetcode : Yes
 * // Any problem you faced while coding this :
 */

public class MaxArea {
    public int maxArea(int[] height) {
        int maxarea = 0;
        int l = 0;
        int r = height.length - 1;
        while (l<r) {
            maxarea = Math.max(maxarea, Math.min(height[l], height[r])*(r-l));
            if (height[l]<height[r])
                l++;
            else
                r--;
        }
        return maxarea;
    }
}