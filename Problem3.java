// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach

/**
 * Using 2 pointers from beginning and end of array to start calculating the max water based on minimum height at left and right pointers.
 * If left height was smaller than right right, then move the left pointer to see if there is a bigger height ahead since the width will always be shrinking.
 */
class Solution {
    public int maxArea(int[] height) {
        int maxWater = 0;
        int left = 0;
        int right = height.length -1;
        while (left < right) {
            int minHeight = Math.min(height[left], height[right]);
            int distance = right - left;
            maxWater = Math.max(maxWater, minHeight * distance);

            if (height[left] < height[right])
                left++;
            else
                right--;
        }

        return maxWater;
    }
}