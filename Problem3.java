// Time Complexity :O(N)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach

class Solution {
    public int maxArea(int[] height) {
        if(height==null||height.length==1) return 0;
        int max=0,l=0;
        int r=height.length-1;
        while(l<r){
            if(height[l]<=height[r]){
                max=Math.max(max,height[l]*(r-l));
                l++;
            }
            else {
                max=Math.max(max,height[r]*(r-l));
                r--;
            }

        }
        return max;
    }
}