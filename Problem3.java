// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach
// 2 pointers, left and right to keep track of the area
// solved with 2 possible conditions

class Solution {
    public int maxArea(int[] height) {
        
        if(height == null || height.length <= 1) return 0;
        
        int left = 0, right = height.length - 1, curArea = 0;
        // maximum area
        int max = Integer.MIN_VALUE; 
        
        while(left < right) {
            if(height[left] < height[right]) {
                // height[left] -> minimum height among 
                // the two
                curArea = (right - left) * height[left];
                left++;
            } else {
                curArea = (right - left) * height[right];
                right--;
            }
            max = Math.max(max, curArea);
        }
        
        return max;
    }
}