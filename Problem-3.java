class Solution {
    // Time Complexity : O(n) - n is size of input array
    // Space Complexity : O(1)
    // Did this code successfully run on Leetcode :Yes  
    // Any problem you faced while coding this : NO

    public int maxArea(int[] height) {
        if (height == null || height.length == 0)
            return 0;
        int l = 0;
        int r = height.length - 1;
        int maxArea = 0;
        while(l < r) {
            maxArea = Math.max(maxArea,Math.min(height[l],height[r]) * (r - l));
            if(height[l] < height[r])
                l++;
            else
                r--;
        }
        return maxArea;
    }
}
