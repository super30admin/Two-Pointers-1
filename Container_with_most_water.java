// Time Complexity :O(N) n=number of elements
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach
//use two pointers :left and right . Calculate area (l*b) and decrease/increase based on condition where you can have different combinations of heights

class Solution {
    public int maxArea(int[] height) {
        
        int left=0,right=height.length-1;
        
        int maxArea=0;
        
        while(left<right){
            maxArea=Math.max(maxArea,(right-left)*Math.min(height[left],height[right]));
            
            if(height[left]<=height[right]){
                
                ++left;
            }else {
                --right;
            }
        }
        
      return maxArea;  
    }
}