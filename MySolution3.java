class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int maxSize = 0;

        while(l<r){
            maxSize = Math.max((Math.min(height[l],height[r]) * (r-l)),maxSize);
            if(height[l]<height[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return maxSize;
    }
}