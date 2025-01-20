class MaxAreaSolution {
    public int maxArea(int[] height) {
        int max = 0;
        if (height == null || height.length < 2) {
            return max;
        }
        int n = height.length;
        // [1,8,6,2,5,4,8,3,7]
        // [0,1,2,3,4,5,6,7,8] = 7*(8-1)
        int left = 0;
        int right = n - 1;
        while (left < right) {
            max = Math.max(max, Math.min(height[left], height[right]) * (right - left));
            if (height[left] <= height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }
}