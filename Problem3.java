class Problem3 {
    public int maxArea(int[] height) {
        int low=0;
        int high= height.length-1;
        int area=0;
        while(low<high){
            int h=0;
            int w= high-low;
            if(height[low]<height[high]){
                h=height[low];
                low++;
            }
            else{
                h=height[high];
                high--;
            }
            area= Math.max(area, h*w);
        }
        return area;
    }
}