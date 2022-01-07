// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : y
// Any problem you faced while coding this : n
public class Solution {
    public int maxArea(int[] height) {
        int ans = 0, l = 0, r = height.length - 1;
        
        while (l <= r) {
            ans = Math.max(ans, Math.min(height[l], height[r]) * (r-l));
            if (height[l] < height[r]) l++;
            else r--;
        }
        return ans;
    }
}
