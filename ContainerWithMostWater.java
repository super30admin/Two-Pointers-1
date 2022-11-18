//Time complexity is O(N)
//Space complexity is O(1)
class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int l = 0;
        int r = height.length-1;
        while(l<r){
            int h = Math.min(height[l], height[r]);
            maxArea = Math.max(maxArea, h*(r-l));
            if(height[l]<height[r]){
                l=l+1;
            }
            else{
                r=r-1;
            }
        }
        return maxArea;
    }
}