class Solution {
    public int maxArea(int[] height) {
        /* 1. l = 0 , r = height,length - 1;
        2. (r-l) * Math.min( height[l] , height[r] ) = vol
        3. l++ , r-- till ( l<=r)
        o(n/2) */

        int l = 0;
        int r = height.length - 1; //8
        int max = 0;
        int vol = 0;

        while( l <= r ){
            vol = (r-l) * Math.min( height[l] , height[r] );
            if( max < vol ){
                max = vol;
            }
            if( height[l] < height[r] ){
                l++;
            }
            else{
                r--;
            }

        }
        return max;

    }
}