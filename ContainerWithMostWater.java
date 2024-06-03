// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// logic: Initialize Pointers and Variables: Start with two pointers, left at the beginning and right at the end of the array, and initialize max to store the maximum area found.
// Calculate Area and Adjust Pointers: In each iteration, calculate the area formed by the lines at the left and right pointers.
// Update max if this area is larger than the current max. Then, move the pointer pointing to the shorter line inward, since the height of the container is determined by the shorter line.
// Continue Until Pointers Meet: Repeat the process until the left and right pointers meet.

class Solution {
    public int maxArea(int[] height) {
        if (height == null || height.length == 0) {
            return 0;  // Return 0 if the input is null or empty
        }

        int n = height.length;
        int left = 0;  // Pointer at the start of the array
        int right = n - 1;  // Pointer at the end of the array
        int max = 0;  // Variable to store the maximum area

        while (left < right) {
            // Calculate the area with the current pointers
            int currentArea = Math.min(height[left], height[right]) * (right - left);
            // Update max if the current area is greater
            max = Math.max(max, currentArea);

            // Move the pointer pointing to the shorter line inward
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return max;  // Return the maximum area found
    }
}
