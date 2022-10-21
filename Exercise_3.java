class Solution {
    public int maxArea(int[] height) {
        int ma = 0;
        int l = 0;
        int r = height.length-1;
        while(l<r){
            ma = Math.max(ma,(r-l)*Math.min(height[l], height[r]));
            if(height[l]<=height[r]){
                ++l;
            }else{
                --r;
            }
        }
        return ma;
    }
}
//tc=O(n)
//sc=O(1)
