// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

public class ContainersWithMostWater {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int max = 0;
        while (l < r) {
            int temparea = Math.min(height[l], height[r]) * (r - l);
            max = Math.max(max, temparea);
            if (height[l] < height[r]) {
                l++;
            } else r--;
        }
        return max;   
    }
}
