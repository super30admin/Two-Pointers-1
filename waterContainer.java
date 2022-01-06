class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int maxArea=0;
        int temp=0;
        while(i<j){
            temp=Math.min(height[i],height[j])*(j-i);
            if(temp>maxArea){
                maxArea=temp;
            }
            if(height[i]<height[j]){
                i=i+1;
            }else if(height[j]<height[i]){
                j=j-1;
            }else{
                i=i+1;
                j=j-1;
            }
        }
        return maxArea;
    }
}