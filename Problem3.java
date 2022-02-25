//TC=O(n)
//SC=O(1)

class Solution {
    public int maxArea(int[] height) {
        
        int l=0, r=height.length-1;
        int max=Math.min(height[l],height[r])*(r-l), area;
        while(l<r){
            if(height[l]<height[r]){
                l++;
            }
            else if(height[l]==height[r]){
                l++;
                r--;
            }
            else{
                r--;
            }
            area=Math.min(height[l],height[r])*(r-l);
            if(area>max){
                max=area;
            }
        }
        return max;
    }
}