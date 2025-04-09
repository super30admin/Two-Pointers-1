// Time complexity:- O(n)
// Space complexity:- O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach in three sentences
/**
 * Approach: 
 * In this problem, I have to find the maximum area that can be formed by two vertical lines from the array of heights.
 * I used the two-pointer technique, where one pointer starts at the beginning of the array and the other at the end.
 * In each iteration, I calculate the area between the two pointers and move the pointer pointing to the smaller height inward to maximize the area.
 */ 
class Solution {
    public int maxArea(int[] height) {
        // Base case: 
        if (height.length < 2 || height == null) {
            return 0;
        }

        // Initialize variables to store the maximum area found so far and array length.
        int max = 0;
        int n = height.length;

        int left = 0;
        int right = n - 1;

        // Loop until the left pointer is less than the right pointer.
        while (left < right) {

            // Calculate the current area between the two pointers.
            int curr = Math.min(height[left], height[right]) * (right - left);
            
            // Update the maximum area if the current area is greater than the previous max.
            max = Math.max(max, curr);

            // Move the pointer pointing to the smaller height to potentially increase the area.
            if (height[left] < height[right]) {
                left++;  
            } else {
                right--;  
            }
        }

        // Return the maximum area
        return max;
    }
}

