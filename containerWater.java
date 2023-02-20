// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
//used 2 pointers

class Solution {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length - 1;
        int max = 0;
        while (start < end) {
            if (height[start] > height[end]) {
                max = Math.max(max, height[end] * (end - start));
                end--;
            } else {
                max = Math.max(max, height[start] * (end - start));
                start++;
            }
        }
        return max;
    }
}