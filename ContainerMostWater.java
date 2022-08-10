class Solution {
    /*
     * Time - O(n)
     * Space - O(1)
     */
    public int maxArea(int[] height) {
        int l=0, r=height.length-1;
        int maxArea = 0;
        
        while (l<r) {
            int area = (r-l) * Math.min(height[l], height[r]);
            if (area>maxArea)
                maxArea=area;
            if (height[l]<height[r])
                l++;
            else 
                r--;
        }
        return maxArea;
    }
}