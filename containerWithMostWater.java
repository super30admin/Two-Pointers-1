// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :  Yes


// Your code here along with comments explaining your approach

class Solution {
    public int maxArea(int[] height) {
        int max = Integer.MIN_VALUE;
        
        int left = 0;
        int right = height.length - 1;
        
        while(left<right){
            int min = Math.min(height[left], height[right]);
            max = Math.max(max, min * (right - left));
            
            if(height[left] < height[right]) left ++;
            
            else right --;
        }
        
        return max;
        
    }
}