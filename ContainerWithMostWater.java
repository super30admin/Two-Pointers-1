// Time Complexity : O(n) => As we iterate over the entire array of size n
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
/*
Approach: Used 2 pointers technique. Set the left pointer to point at 1st index and right pointer to point the last element.
Then compare the one with minimum height move that pointer as width is going to shrink anyway.
 */
class Solution {
    public int maxArea(int[] height) {

        if (height.length == 0 || height == null) {
            return 0;
        }

        int left = 0;
        int right = height.length - 1;
        int max = 0;

        while (left < right) {
            int minHeight = Math.min(height[left], height[right]);
            int width = right - left;

            max = Math.max(max, width * minHeight);

            //we are comparing heights to move pointers as width is going to shrink anyway
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }

        }

        return max;
    }
}

// Time Complexity : O(n^2) => As we have 2 for loops iterating over all the
// elements of the array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
/*
 * Brute-force Approach: Used 2 for loops to iterate over all the elements and
 * calculate the maximum area. This approach gives TLE as time complexity is
 * O(n^2).
 */
// class Solution {
// public int maxArea(int[] height) {

// if (height.length == 0 || height == null) {
// return 0;
// }

// int max = 0;
// int n = height.length;

// for (int i = 0; i < n; i++) {
// for (int j = i + 1; j < n; j++) {
// int width = (j - i);
// int minHeight = Math.min(height[i], height[j]); // Consider min height to
// avoid overflow
// max = Math.max(max, (width * minHeight)); // Calculates area
// }
// }

// return max;
// }
// }