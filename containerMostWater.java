//TC: O(N)
//SC: O(1)
class Solution {
    public int maxArea(int[] height) {
        int low = 0;
        int high = height.length-1;
        int maxArea = 0;
        
        while(low<high) {
            int width = (high-low);
            int height1 = Math.min(height[low], height[high]);
            int area = height1*width;
            maxArea = Math.max(maxArea, area);
            
            if(height[low] <= height[high]) {
                low ++;
            }else {
                high--;
            }
        }
        return maxArea;
    }
}