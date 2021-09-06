// Time Complexity : O(n) 
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
class maxAreaWaterContainer{
    public int maxArea(int[] height) {
        if(height == null || height.length == 0){
            return 0;
        }
        int max = 0; int low = 0; int high = height.length -1;
        while(low < high){
            max = Math.max(max, Math.min(height[low], height[high]) * (high-low));
            if(height[low] < height[high]){
                low++;
            }
            else{
                high--;
            }
        }
        return max;
    } 
}