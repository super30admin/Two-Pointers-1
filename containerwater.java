// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Yes

// Your code here along with comments explaining your approach

class Solution {
    public int maxArea(int[] height) {
        int vol = 0;
        int max = 0;
        int low = 0;
        int high = height.length - 1;
        while (low < high) {
            vol = Math.min(height[low], height[high]) * (high - low);
            max = Math.max(max, vol);
            if (height[low] < height[high]) {
                low++;
            } else
                high--;
        }
        return max;

    }
}