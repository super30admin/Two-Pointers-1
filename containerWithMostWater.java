// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public int maxArea(int[] height) {
        int maxArea=0;
        int i=0,j=height.length-1;
        while(i<j){
            //take min height of the walls
            int l=Math.min(height[i],height[j]);
            int w=j-i;
            int area=l*w;
            maxArea=Math.max(maxArea,area);
            // move the smaller wall
            if(height[i]<=height[j]) i++;
            else j--;
        }
        return maxArea;
    }
}