// Time Complexity :o(n)
// Space Complexity :o(1)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this :NO

// Your code here along with comments explaining your approach
class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        //set the left and right pointers
        int l = 0; int r = height.length-1;
        while(l < r){
            //get the max area between the previous max area and the current area
            max = Math.max(max, (Math.min(height[l],height[r]) * (r-l)));
            //checking which pointer to move
            if(height[l] <= height[r]){
                l++;
            }else{
                r--;
            }
        }
        return max;
    }
}