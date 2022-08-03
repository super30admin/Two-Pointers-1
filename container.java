// Time Complexity :O(n)
// Space Complexity :O(1)
class Solution {
    public int maxArea(int[] height) {
        int x=0;
        int y=height.length-1;
        int maxArea = Integer.MIN_VALUE;
        while(x<y){
            int area = (y-x)*(Math.min(height[x],height[y]));
            maxArea = Math.max(area,maxArea);
            if(height[x]<height[y])
                x++;
            else
                y--;
        }
        return maxArea;
    }
}
