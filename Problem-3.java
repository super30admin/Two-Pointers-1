// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach
// Use two pointers at the left and right ends to maximize width initially.
// Compute the area by using the shorter height, then move the pointer pointing to the smaller height to try for a taller boundary.
// Keep updating the maximum area until both pointers meet.

class Solution {
    public int maxArea(int[] height) {
        int low = 0;
        int high = height.length -1;
        int area = 0;
        int h = 0;
        while (low<high){
            int w = high-low;
            if (height[low] < height[high]){
                h = height[low];
                low += 1;
            }else{
                h = height[high];
                high -= 1;
            }
            area = Math.max(area,h*w);
        }
        return area;
        
    }
}