// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


class Solution {
    public int maxArea(int[] height) {
        
        // TC:O(n)
        // SC:O(1)
        int max = 0;
        int n = height.length;
        int low = 0;
        int high = n-1;
        while(low < high) {
            int currArea = (high - low) * Math.min(height[high], height[low]);
            max = Math.max(max, currArea);
            if(height[low] <= height[high]) {
                low++;
            }
            else {
                high--;
            }
        }
        return max;
    }
}