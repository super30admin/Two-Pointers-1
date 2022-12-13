// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
/*
 * Using the 2 pointer approach, calculate the area and assign max with maximum area. 
 * Move the pointer based on the height to find the maximum area.
 */
public class containerWithWater {

    public int maxArea(int[] height) {
        int max = 0;
        int left = 0, right = height.length - 1;

        while (left < right) {
            int currArea = Math.min(height[left], height[right]) * (right - left);
            max = Math.max(max, currArea);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return max;
    }

}
