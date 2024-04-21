// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/*
 * The wall with mimum height holds the limit of water
 * as we see the minimum height between two walls we can calculate the area and move the index at minimum wall 
 *  to the next index (if its right right-- or left ++)
 */

public class ContainerwithMostWater {

    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left <= right) {
            int leftWall = height[left];
            int rightWall = height[right];
            if (leftWall < rightWall) {
                maxArea = Math.max(maxArea, area(leftWall, left, right));
                left++;
            } else {
                maxArea = Math.max(maxArea, area(rightWall, left, right));
                right--;
            }
        }

        return maxArea;
    }

    private int area(int minWall, int left, int right) {
        return minWall * (right - left);
    }
}