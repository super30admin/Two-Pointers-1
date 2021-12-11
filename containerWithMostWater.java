// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public int maxArea(int[] height) {
        if (height == null || height.length == 0) return 0;
        int left = 0, right = height.length-1, maxArea = 0;

        // Iterate till left is less than right
        while(left < right) {
            // Calculate maxArea which is length*breadth
            maxArea = Math.max(maxArea, (right-left)*(Math.min(height[left], height[right])));
            if (height[left] < height[right]) {
                left++;
            }
            else {
                right--;
            }
        }
        return maxArea;
    }
}