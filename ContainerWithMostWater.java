// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// 1: We use 2 pointers at opposite ends of the array to iteratively calculate the max area we can achieve
// 2: We move the pointer with the constraining height at each iteration
// 3: At the end we return the max height
class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int max = 0;
        int l = 0;
        int r = n-1;
        while(l < r){
            int currArea = Math.min(height[l], height[r]) * (r-l);
            if(currArea > max){
                max = currArea;
            }
            if(height[l] < height[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return max;
    }
}