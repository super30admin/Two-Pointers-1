// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


class Solution {
    public int maxArea(int[] height) {
        if(height == null || height.length == 0){
            return 0;
        }
        int max = 0;
        int l = 0; // left pointer
        int r = height.length - 1; // right pointer
        while(l < r){
            max = Math.max(max, Math.min(height[l],height[r]) * (r-l) ); // maximum of max or new area
            if(height[l] < height[r]){ // moving the pointer toward higher element
                l++; // move left
            }else{
                r--; // move right
            }
        }

        return max;
    }
}
