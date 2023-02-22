class Solution {
    public int maxArea(int[] height) {
        int low=0;
        int high=height.length-1;
        int area=0;
        while(low<high){
            int ar= Math.min(height[low],height[high])*(high-low);
            area=Math.max(area,ar);
            if(height[high]<height[low]) high--;
            else low++;
        }
        return area;
    }
}