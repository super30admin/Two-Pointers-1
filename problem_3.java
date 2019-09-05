class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0, l = 0, r = height.length - 1;

        while (l < r) {
            int lowerHeight = Math.min(height[l], height[r]);
            maxArea = Math.max(maxArea, lowerHeight * (r - l));

            if (height[l] < height[r])
                l++;
            else
                r--;
        }

        return maxArea;
    }

}