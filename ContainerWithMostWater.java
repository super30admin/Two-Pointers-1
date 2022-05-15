// Time Complexity : O(n) n is length of array
// Space Complexity : O(1) no aux space required
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach: 2 pointers. increment the left/decrement right till we find taller height, 
// as width will always be decreasing so will be the area. so for larger area we have to find taller pillars.

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int max = 0;

        int l = 0;
        int r = height.length - 1;

        while (l < r) {
            int minHeight = Math.min(height[l], height[r]);
            max = Math.max(max, minHeight * (r - l));
            if (minHeight == height[l]) {
                // increment left till we find taller height
                while (l < r && height[l] <= minHeight) {
                    l++;
                }
            } else {
                // decrement right till we find taller height
                while (l < r && height[r] <= minHeight) {
                    r--;
                }
            }
        }
        return max;
    }
}
