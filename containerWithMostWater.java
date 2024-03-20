// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes


lass Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int n = height.length;
        int l = 0;
        int r = n - 1;
        int currArea = 0;
        while(l<r){
            currArea = Math.min(height[l],height[r])*(r-l);
            maxArea = Math.max(maxArea, currArea);

            if(height[l]<height[r]){
                l++;
            }else{
                r--;
            }

        }
        return maxArea;
    }
}