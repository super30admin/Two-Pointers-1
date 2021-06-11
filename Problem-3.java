// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Here we use 2 pointers (left and right)
// We start from left to right and keep track of the max area in each iteration
// and move left/right pointer based on which one is smaller. (move the pointer with smaller value towards center of the array)
class Solution3 {
    public int maxArea(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }
        int max = 0;
        int n = height.length;

        int left = 0, right = n - 1;

        while (left < right) {
            int newArea = Math.min(height[left], height[right]) * (right - left);
            max = Math.max(max, newArea);
            if (height[left] > height[right]) {
                right--;
            } else {
                left++;
            }
        }

        return max;
    }
}