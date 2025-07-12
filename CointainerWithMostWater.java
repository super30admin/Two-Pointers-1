// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Had to revise basic syntax

// ## Problem3 (https://leetcode.com/problems/container-with-most-water/)

// You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
// Find two lines that together with the x-axis form a container, such that the container contains the most water.
// Return the maximum amount of water a container can store.
// Notice that you may not slant the container.

// Example 1:
// Input: height = [1,8,6,2,5,4,8,3,7]
// Output: 49
// Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.

// Example 2:
// Input: height = [1,1]
// Output: 1
 
// Constraints:
// n == height.length
// 2 <= n <= 105
// 0 <= height[i] <= 104

class Solution {
    public int maxArea(int[] height) {
        // Base Case: input array is null or empty
        if (height == null || height.length == 0){
            return 0;
        }

        int left = 0; // left pointer at the beginning
        int right = height.length - 1; // right pointer at the end
        int max = 0; // to store the maximum area

        // processing until two pointers meet
        while (left < right){
            // calculating area formed by the lines at left and right then updating max if current area is larger
            max = Math.max(max, Math.min(height[left], height[right]) * (right - left));

            // moving pointer pointing to the shorter line inward, since area is limited by the shorter height
            if (height[left] < height[right]){
                left++;
            }
            else {
                right--;
            }
        }

        // returning maximum area found
        return max;
    }
}