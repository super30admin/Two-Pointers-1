// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach
/* use two pointer approach to find tha maximum area of the rectangle 
height being value and width being difference between indexes
time-O(n)
space- O(1)*/

class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int m=0;
        int a=0;
        int r=height.length-1;
        while(l<r){
            //find maximum area
            a=Math.max(Math.min(height[l], height[r])*(r-l),a);
            if(height[l]<height[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return a;
    }
}