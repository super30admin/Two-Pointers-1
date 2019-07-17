class Solution {
    public int maxArea(int[] height) {
        int x=0,y=height.length-1;
        int area=0;
        while(x<y)
        {
            area=Math.max(area,Math.min(height[x],height[y])*(y-x));
            if(height[y]>height[x]){x++;}
            else{y--;}
        }
        return area;        
    }
}