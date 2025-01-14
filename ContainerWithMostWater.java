class ContainerWithMostWater {
    public int maxArea(int[] height) {
        if(height == null || height.length == 0){
            return 0;
        }

        int n = height.length;
        int l = 0, r=n-1;
        int maxArea = Integer.MIN_VALUE;
        while(l<r){
            int width = r-l;
            maxArea = Math.max(maxArea, Math.min(height[r],height[l]) * width);
            if(height[l] <= height[r]){
                l++;
            } else {
                r--;
            }
        }
        return maxArea;
    }
}
