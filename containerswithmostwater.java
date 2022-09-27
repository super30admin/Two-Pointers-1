// tc - O(n)
// sc - O(1)
// ran in leetcode -yes


class Solution {
    public int maxArea(int[] height) {
        int l =0;
        int r = height.length -1;
        int maxarea = 0;
        while(l < r){
            int  area = (r-l) * Math.min(height[l] , height[r]);
            if(area > maxarea){
                maxarea = area;
            }
            if(height[l] < height[r]){
                l++;
            }else{
                r--;
            }
        }
        return maxarea;
    }
}
