// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public int maxArea(int[] height) {
        if(height==null||height.length==0)
            return 0;
        int l = 0;
        int r = height.length-1;
        int max = Integer.MIN_VALUE;
        while(l<r){
            max = Math.max(max,Math.min(height[l],height[r])*(r-l));
            if(height[l]>height[r])
                r--;
            else
                l++;
        }
        return max;
    }
}