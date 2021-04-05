//Time Complexity :  O(n)
//Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
// Your code here along with comments explaining your approach
class Solution {
    public int maxArea(int[] height) {
        if(height==null||height.length==0){
            return 0;
        }
        //use two pointers
        int i=0,j=height.length-1,maxArea = Integer.MIN_VALUE;
        while(i<j){
            //the height is the min value of the elements pointed by i and j as to balance equal length and  width is j-i
            int area = Math.min(height[i],height[j]) * (j-i);
            maxArea = Math.max(area,maxArea);
            //as the width may decrease over time choose the height to be maximum to get max area
            if(height[i] > height[j]){
                j--;
            }
            else{
                i++;
            }
        }
        return maxArea;
    }
}