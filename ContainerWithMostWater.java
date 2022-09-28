// Time Complexity : O(n) where n is number of elements in array.
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :

class Solution {
    public int maxArea(int[] height) {
        if(height == null || height.length == 0) return 0;

        int n = height.length;
        int l = 0;
        int h = n-1;
        int max = Integer.MIN_VALUE;

        while(l<h) {
            int minHeightLvl = Math.min(height[l], height[h]);
            max = Math.max(max, minHeightLvl*(h-l));
            if(height[l]<height[h]){
                l++;
            } else {
                h--;
            }
        }
        return max;
    }
}