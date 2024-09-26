// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :

class Solution {
    public int maxArea(int[] height) {
        int maxarea=0;
        int startptr=0, endptr=height.length-1;
            while(startptr<endptr){
         maxarea=Math.max(maxarea,Math.min(height[startptr],height[endptr])*(endptr-startptr));
             if(height[startptr]<height[endptr]){
                 startptr++;
             }
                else{endptr--;}
            }
            
        return maxarea;
    }
}
// Your code here along with comments explaining your approach