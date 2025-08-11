class Solution {
    public int maxArea(int[] height) {
        if (height == null || height.length < 2){
            return 0;
        }
        int n = height.length;
        int left = 0;
        int right = n - 1;
        int maxArea = 0;

        while (left < right) {
            maxArea = Math.max(maxArea, Math.min(height[left], height[right]) * (right - left));
            if (height[left] == height[right]) {
                left++;
                right--;
            } else if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}