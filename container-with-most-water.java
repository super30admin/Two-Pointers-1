//Time Complexity --> O(n) --> Since we iterate to find the area covered by selecting the height
//Space Complexity --> O(1) 

class Solution {
    public int maxArea(int[] height) {
        
        //null
        if(height == null || height.length == 0) return -1;
        int n = height.length;
        int max = 0;
        int low = 0;
        int high = n-1;
        while(low <= high) {
            max = Math.max(max, Math.min(height[low],height[high]) * (high-low));
            if(height[low] < height[high]){
                low++;
            }else {
                high--;
            }
        }
        return max;
    }
}
