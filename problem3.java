// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No, just need to move the smaller height pointer.


// Your code here along with comments explaining your approach in three sentences only
// I use two pointers at start and end and calculate area using width and minimum height.
// To possibly get a bigger area, I always move the pointer with smaller height because that is the limiting factor.
// I keep updating max area until pointers cross.

class Solution {
    public int maxArea(int[] height) {

        int left = 0;
        int right = height.length - 1;
        int max = 0;

        while (left < right) {

            int h = Math.min(height[left], height[right]);
            int w = right - left;

            max = Math.max(max, h * w);

            if (height[left] < height[right]) left++;
            else right--;
        }

        return max;
    }
}
