//Time complexity:O(n)
//Space complexity: O(1)

class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
       int maxarea=0; int l=0; int r= n-1;
        while(l<=r)
        {
            maxarea= Math.max(maxarea, (Math.min(height[l], height[r]) * (r-l)));
            if(height[l]<height[r])
            {
                l++;
            }
            else
            {
                r--;
            }
        }
        return maxarea;
    }
}