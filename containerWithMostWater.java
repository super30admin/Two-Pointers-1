// Time Complexity : O(n) where n is the length of the array nums
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach

class containerWithMostWater {
    public int maxArea(int[] height) {
        int n = height.length;
        int l = 0, r = n - 1;
        int ans = 0;
        while (l < r) {
            ans = Math.max(ans, Math.min(height[r], height[l]) * (r - l));
            if (height[r] > height[l]) l++;
            else r--;
        }
        return ans;
    }
}