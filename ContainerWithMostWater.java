// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Approach: Use two pointers technique. Calculate the area between two pointers. Increment low pointer if the height of 
// the bar at low is smaller than the bar at high. Continue this until low < high.

class ContainerWithMostWater {
    public int maxArea(int[] height) {
        if (height == null || height.length ==0) return 0;
        
        int low =0;
        int high = height.length -1;
        int maxArea = Integer.MIN_VALUE;
        
        while (low < high) {
             int currentArea = Math.min(height[low], height[high]) * (high-low);
            maxArea = Math.max(maxArea,currentArea);
            
            if (height[low] < height[high]) {
                low++;    
            }
            else {
                high--;    
            }
            
        }
        return maxArea; 
    }
}