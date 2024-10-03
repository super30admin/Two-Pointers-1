class Solution {
    public int maxArea(int[] height) {
        int max=0,low=0,high=height.length-1;
        while(low<high){
            int cap=Math.min(height[low],height[high])*(high-low);
            max=Math.max(max,cap);
            if(height[low]<height[high]) low++;
            else high--;
        }
        return max;
    }
}
