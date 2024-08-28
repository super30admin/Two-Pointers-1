// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// Need to maximise effective height as length anyways. stick to the largest height and move the pointer away from smaller height.

class Solution {
    public int maxArea(int[] height) {
        int max = Integer.MIN_VALUE;
        int l = 0; int r = height.length -1;
        while (l<r){
            max = Math.max(max, (r-l)*Math.min(height[l], height[r]));
            if(height[l] > height[r]) r--;
            else l++;
        }

        return max;
    }
}