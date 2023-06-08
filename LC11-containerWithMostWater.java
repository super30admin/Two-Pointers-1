class Solution {
    public int maxArea(int[] height) {

        int l = 0;
        int r = height.length -1;
        int max = 0;
        while (l<r) {
            max = Math.max(max, Math.min(height[l],height[r])*(r-l));

            // move ptr of lower (because min will decide the water contain)
            if (height[l] <= height[r]) {
                l++;
            }
            else {
                r--;
            }
        }

        return max;
    }
}