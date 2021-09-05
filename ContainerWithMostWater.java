// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public int maxArea(int[] height) {
        // return 0 if array is null or empty
        if(height == null || height.length == 0) return 0;
        // intialize low and high pointers; max value
        int low = 0; int high = height.length - 1;
        int max = 0;
        // traverse through the array until high and low pointer don't meet
        while(high > low){
            // caluclate the area between low and hogh pointers
            int area = (high - low) * Math.min(height[low], height[high]);
            // compare it with previous max
            max = Math.max(max, area);
            // move away from the limiting height
            if(height[low] < height[high]) low ++;
            else high --;
        }
        return max;
    }
}