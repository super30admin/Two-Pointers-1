// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :

class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int low = 0;
        int high = height.length - 1;
        while (low < high) {
            // Find the max area between low and high
            max = Math.max(max, Math.min(height[low], height[high]) * (high - low));

            // Move the pointer pointing to shorter height
            if (height[low] < height[high])
                low++;
            else
                high--;
        }
        return max;
    }
}