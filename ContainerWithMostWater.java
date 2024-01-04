class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int l = 0;
        int r = height.length - 1;

        while(l < r) {
            int currArea = Math.min(height[l], height[r]) * (r-l);
            if(currArea > maxArea) {
                maxArea = currArea;
            } else {
                if(height[l] < height[r]) {
                    l++;
                } else {
                    r--;
                }
            }
        }

        return maxArea;
    }
}