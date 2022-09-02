// Time Complexity : 0(log n)
// Space Complexity : 0(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Nothing as such

public class problem3 {
    public int maxArea(int[] height) {
        int max = 0;
        int n = height.length;
        int low = 0;
        int high = n - 1;
        while (low < high) {
            if (height == null || height.length == 0)
                return 0;
            int area = Math.min(height[low], height[high]) * (high - low);
            max = Math.max(area, max);
            if (height[low] <= height[high]) {
                low++;
            } else {
                high--;
            }
        }
        return max;

    }
}
