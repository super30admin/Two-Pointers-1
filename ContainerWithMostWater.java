class Solution {
    // Time Complexity : O(n)
    // Space Complexity : O(1)
    // Did this code successfully run on Leetcode : Yes
    // Any problem you faced while coding this : No

    public int maxArea(int[] height) {
        int len = height.length;
        int left = 0;
        int right = len-1;
        int area = Integer.MIN_VALUE;
        while(left < right) {
            area = Math.max(area, (right-left) * Math.min(height[left], height[right]));
            if(height[left] > height[right]) {//right is shorter, decrease right
                right--;
            } else {
                left++;
            }
        }
        return area;
    }
}