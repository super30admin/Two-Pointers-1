// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

public class WaterContainer {
    public int maxArea(int[] height) {
        if(height == null || height.length == 0) return 0;
        int left = 0, right = height.length - 1;
        int max = 0;
        
        while(right >= left) {
            int width = (right-left) * (Math.min(height[left], height[right]));
            max = Math.max(max, width);
            
            if(height[left] >= height[right]) {
                    right--;
            } else {
                    left++;
            }
        }
        return max;
    }
}
