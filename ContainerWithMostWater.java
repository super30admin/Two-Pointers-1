// TIME: O(N)
// SPACE: O(1)
// SUCCESS on LeetCode

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int max = 0;
        int start = 0;
        int end = height.length - 1;
        
        while (start < end) {
            max = Math.max(max, (end - start) * Math.min(height[start], height[end]));
            if (height[start] < height[end]) {
                start++;
            } else if (height[start] > height[end]) {
                end--;
            } else {
                start++;
                end--;
            }
        }
        
        return max;
    }
}
