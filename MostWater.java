class MostWater {
    // Time Complexity : O(n)
    // Space Complexity: O(1)
    public int maxArea(int[] height) {
        if(height == null || height.length == 0)
            return 0;
        
        int left = 0, right = height.length - 1;
        int max = Integer.MIN_VALUE;
        while(left <= right){
            int area = 0;
            if(height[left] <= height[right]){
                area = height[left] * (right - left);
                left += 1;
            } else if( height[left] > height[right] ){
                area = height[right] * (right - left);
                right -= 1;
            }
            max = Math.max(max, area);
        }
        return max;
    }
}
