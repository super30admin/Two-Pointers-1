// Time Complexity : O(n^2) where n is the length of the array nums
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
// for every num in array, find area with every possible number.
// output max

class containerWithMostWater_BruteForce {
    public int maxArea(int[] height) {
        int n = height.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = n-1; j > i; j--) {
                ans = Math.max(ans, (j-i) * Math.min(height[i], height[j]));
            }
        }
        return ans;
    }
}