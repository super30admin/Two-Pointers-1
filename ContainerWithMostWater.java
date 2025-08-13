// Time Complexity : O(n) // n = number of heights
// Space Complexity : O(1) // only a few variables used
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
//
// Approach :
// 1. Use two pointers (left & right) starting at both ends of the array.
// 2. Calculate the area using width = r - l and height = min(height[l], height[r]).
// 3. Move the pointer pointing to the smaller height inward to try finding a taller line.

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int n = height.length;
        int max = 0;
        int l = 0, r = n - 1;

        while (l < r) {
            int w = r - l;
            int h;
            if (height[l] < height[r]) {
                h = height[l];
                l++; // move left pointer to potentially find taller line
            } else {
                h = height[r];
                r--; // move right pointer to potentially find taller line
            }
            max = Math.max(max, h * w); // store max area found so far
        }

        return max;
    }
}
