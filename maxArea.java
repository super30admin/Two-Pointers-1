// Time Complexity : O(n)
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO


// Your code here along with comments explaining your approach

public class Solution {
    public int maxArea(int[] height) {
        
        // keep overall max
        int maxarea = 0, l = 0, r = height.length - 1;
        
        while (l < r) {
            
            // compare max with current water holding capacity and reassign if required
            maxarea = Math.max(maxarea, Math.min(height[l], height[r]) * (r - l));
            
            // if left(height) is less than height(right) move to left+1 else move right index -1
            if (height[l] < height[r])
                l++;
            else
                r--;
        }
        return maxarea;
    }
}
