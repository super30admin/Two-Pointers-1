// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


class Solution {
    public int maxArea(int[] height) {
        // Initialize the result with the smallest possible integer value
        int result = Integer.MIN_VALUE;

        // Set the left pointer to the beginning of the array
        int left = 0;

        // Set the right pointer to the end of the array
        int right = height.length - 1;

        // Loop until the two pointers meet
        while (left < right) {
            // Calculate the area with the current left and right pointers
            int area = Math.min(height[left], height[right]) * (right - left);

            // Update the result with the maximum area found so far
            result = Math.max(result, area);

            // Move the left pointer to the right if the height at left is less than the height at right
            // Otherwise, move the right pointer to the left
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        
        // Return the maximum area found
        return result;
    }
}
