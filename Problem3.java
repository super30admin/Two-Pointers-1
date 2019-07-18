// Your code here along with comments explaining your approach
// 3 points :  
	// using two pointer.  
	// 1. we use two pointer one at end and one at beginning. we take a varible for max area to store the area till ith positon.
    // 2.  at every step , we find the area between the two pointers and move towards the pointer which is low.
    

	// Time Complexity : O(n)
	// Space Complexity :  O(1) i.e Constant memory
	
	// Did this code successfully run on Leetcode : Yes
	// Any problem you faced while coding this : No

public class Solution {
    public int maxArea(int[] height) {
        int maxarea = 0, l = 0, r = height.length - 1;
        while (l < r) {
            maxarea = Math.max(maxarea, Math.min(height[l], height[r]) * (r - l));
            if (height[l] < height[r])
                l++;
            else
                r--;
        }
        return maxarea;
    }
}
