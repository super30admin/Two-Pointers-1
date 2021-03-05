class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;

        int max = Integer.MIN_VALUE;

        // Using 2 pointer approach
        while (left < right) {
            // finding max value og container
            max = Math.max(max, Math.min(height[left], height[right]) * (right - left));

            // if height of left is less then move left pointer to right
            // else move right pointer to left
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        // return the max value a container can store.
        return max;
    }
}

// Time Complexity : O(n)
// Space Complexity: O(1)