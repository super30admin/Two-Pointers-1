class Solution {
    public int maxArea(int[] height)
    {
        int start = 0;
        int end = height.length-1;
        int area = 0;
        
        while(start<end){
            if(height[start]<height[end]){
                area = Math.max(area, height[start]*(end-start));
                start++;
            }else{
                area = Math.max(area, height[end]*(end-start));
                end--;
            }
        }
        return area;
        
    }
}