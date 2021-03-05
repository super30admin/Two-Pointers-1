// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int max = 0;
        int low = 0, high = height.length - 1;

        while (low < high) {
            max = Math.max(max, Math.min(height[low], height[high]) * (high - low));
            if (height[low] < height[high])
                low++;
            else
                high--;
        }
        return max;
    }
}
