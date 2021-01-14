// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES
class Solution {
    public int maxArea(int[] height) {
        int low = 0;
        int high = height.length - 1;
        int max = 0;
        while (low < high) {
            int minHeight = 0;
            int length = high - low;
            if (height[low] < height[high]) {
                minHeight = height[low++];
            } else {
                minHeight = height[high--];
            }
            max = Math.max(max, minHeight * length);
        }
        return max;
    }
}