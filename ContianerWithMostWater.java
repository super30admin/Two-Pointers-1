// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Nope


// Your code here along with comments explaining your approach
// Use 2 pointer to keep track of the minimum height which constraints the height of the contianer with most water
// Update the maxArea as we iterate through the array
class Solution {
    public int maxArea(int[] height) {       
        int maxArea = Integer.MIN_VALUE;
        int left = 0;
        int right = height.length - 1;
        
        while(left < right) {
            maxArea = Math.max(maxArea, Math.min(height[left], height[right]) * (right - left));
            
            if(height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        
        return maxArea;
    }
}