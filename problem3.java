// Tc is O(n) and Sc is O(1)
class Solution {
    public int maxArea(int[] height) {
        int left=0,right=height.length-1;
        int maxArea=0;
        
        while(left<right){
            int width=right-left;
            int Area = Math.min(height[left],height[right])*width;
            
            if(Area>maxArea){
                maxArea=Area;
            }
            if(height[left]<=height[right]){
                ++left;
            }else if(height[right]<height[left]){
                --right;
            }
        }
        return maxArea;
    }
}