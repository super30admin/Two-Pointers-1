// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
// Eliminate nested iterations using 2 pointer approach. If there's a
// start and end such that start < end; The area we get with these values is going
// to be maximum with the start in question because it is the limiting factor.

class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length - 1;
        int res = 0;

        while (start < end) {
            // max of res and current area
            int currentArea = Math.min(height[start], height[end]) * (end - start);
            res = Math.max(res, currentArea);

            if (height[start] > height[end]) {
                // best we can get with this "end" value
                end--;
            } else if (height[start] < height[end]) {
                // best we can get with this "start" value
                start++;
            } else {
                // start and end are equal
                // best we can get with this "start" and "end" value
                end--;
                start++;
            }
        }
        return res;
    }
}