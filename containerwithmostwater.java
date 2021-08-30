class Solution {
    public int maxArea(int[] height) {
        int low=0,high=height.length-1,area=Integer.MIN_VALUE;
        while(low<high){
            int l=Math.min(height[low],height[high]);
            int w=high-low;
            area=Math.max(area,l*w);
            if(height[low]<height[high])
                low++;
            else
                high--;
        }
        return area;
    }
}