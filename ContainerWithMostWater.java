// Time Complexity : O(n) n:array length
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

//Approach: 2-pointers, first pointer at the start and second pointer at the last index. Keep on moving the pointer to thr right and left based on the max height of both.
class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r = height.length-1;
        int area = 0;
        while(l<r){
            area = Math.max(area,(r-l)*Math.min(height[l],height[r]));
            if(height[l]>=height[r])
                r--;
            else
                l++;
        }
        return area; 
    }
}
