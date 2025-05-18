class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int low = 0;
        int high = height.length - 1;
        int maxArea = 0;
        while(low < high){
            int currArea = Math.min(height[low], height[high]) * (high - low);
            maxArea = Math.max(currArea, maxArea);
            if(height[low] < height[high]){
                low ++;
            }
            else{
                high--;
            }
        }
        return maxArea;
    }
}

/**
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */