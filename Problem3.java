
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public int maxArea(int[] height) {
        
        if(height==null || height.length<=0){
            return 0;
        }
        int maxArea=0;
        int left=0;
        int right = height.length-1;
        
        while(left<right ){
            int h = Math.min(height[left], height[right]);
            int width = right - left;
            int area = h*width;
            if(area>maxArea){
                maxArea = area;
            }
            if(height[left]<=height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxArea;
        
    }
}