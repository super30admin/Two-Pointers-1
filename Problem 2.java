// Problem 2: 

// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Time limit exceeded
// Any problem you faced while coding this : Executed for smaller inputs.  


// Your code here along with comments explaining your approach
class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int len = height.length;
        for(int i = 1; i <= len; i++) {
            for(int j = 1; j <= len && j != i; j++) {
                int distancebwlines = Math.abs(j - i);
                int lengthOfShortestLine = height[i-1] < height[j-1] ? height[i-1] : height[j-1];
                int area = distancebwlines * lengthOfShortestLine;
                max = max < area ? area : max;
            }
        }
        return max;
    }
}