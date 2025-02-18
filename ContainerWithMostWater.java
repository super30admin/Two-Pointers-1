// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int max = 0;
        int left = 0;
        int right = n - 1;

        while (left < right) {
            int curr = Math.min(height[left], height[right]) * (right - left);
            max = Math.max(max, curr);
            if (height[left] <= height[right])
                left++;
            else
                right--;
        }
        return max;
    }
}