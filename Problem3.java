// Time Complexity :  O(n)
// Space Complexity :  O(1)
// Did this code successfully run on Leetcode :  Yes
// Any problem you faced while coding this :  No


// increasing the width of the container can only lead to a larger area if the height of the new boundary is greater.
// By following this condition and moving the pointers accordingly, the algorithm explores all possible containers and
// finds the one with the maximum area.

class Solution {
    public int maxArea(int[] height) {
        
        int l=0, r=height.length-1;
        int max=Math.min(height[l],height[r])*(r-l), area;
        while(l<r){
            if(height[l]<height[r]){
                l++;
            }
            else if(height[l]==height[r]){
                l++;
                r--;
            }
            else{
                r--;
            }
            area=Math.min(height[l],height[r])*(r-l);
            if(area>max){
                max=area;
            }
        }
        return max;
    }
}