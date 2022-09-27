// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

class Solution {
    public int maxArea(int[] height) {

        // base case
        if (height == null || height.length <2) return 0;

        // two pointer approach
        int low = 0;
        int high = height.length-1;

        int max = 0;
        while(low<high) {
            int area = Math.min(height[low],height[high])*(high-low);
            max = Math.max(max, area);
            if (height[low]<=height[high]) {
                low++;
            } else {
                high--;
            }
        }
        return max;
    }
}