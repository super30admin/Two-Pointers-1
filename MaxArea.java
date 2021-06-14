class Solution {
    public int maxArea(int[] height) {
        if(height == null || height.length == 0) return 0;
        int low = 0;
        int high = height.length - 1;
        int max = 0;
        while(low< high){
            max = Math.max(max, Math.min(height[high], height[low]) * (high - low));
            if(height[low] < height[high])
                low++;
            else{
                high--;
            }
        }
        return max;
    }
}