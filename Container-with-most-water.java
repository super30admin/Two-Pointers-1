class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int l = 0;
        int r = n-1;
        int max = 0;
        while(l<r){
            int currArea = Math.min(height[l], height[r]) * (r-l);
            max = Math.max(max, currArea);
            if(height[l]<=height[r]){
                l++;
            }else{
                r--;
            }


        }
        return max;
    }
}