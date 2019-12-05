// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :Yes
// Approach: we take two points and an iterator i, then keep taking the area and comparing it to the previos value after each iteration
// we move whichever pointer has the lowest value at its index.


class Solution {
    public int maxArea(int[] height) {
        if(height == null || height.length ==0){
            return 0;
        }
        int i=0,j=height.length-1;
        int area = 0;
        while(i<j){
            area = Math.max(area, Math.min(height[i], height[j]) * (j-i));
            if(height[i] > height[j]){
                j--;
            }
            else{
                i++;
            }
        }
        return area;
    }
}