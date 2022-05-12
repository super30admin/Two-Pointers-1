// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int start =  0, end = height.length -1;
        int maxArea = 0;

        while(start <  end) {
            int width = end - start;
            int minHeight = Math.min(height[start], height[end]);
            maxArea = Math.max(maxArea, width * minHeight);
            if(height[start] < height[end])
                start++;
            else
                end--;
        }
        return maxArea;
    }
}
