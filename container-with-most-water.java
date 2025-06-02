// Approach:
// Use two pointers, one at the beginning and one at the end of the array.
// Calculate the area formed between the two lines and update the max area.
// Move the pointer pointing to the shorter line inward to potentially find a larger area.
// Repeat until the two pointers meet.
//
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        // Loop until pointers meet
        while (left < right) {
            // Calculate area between the two lines
            int currentArea = Math.min(height[left], height[right]) * (right - left);
            // Update max area
            maxArea = Math.max(maxArea, currentArea);

            // Move the pointer pointing to the shorter line
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}
