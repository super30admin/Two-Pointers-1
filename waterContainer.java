//time complexity O(n)
//space complexity O(1)

class Solution {
    public int maxArea(int[] height) { 
        if(height == null || height.length == 0) return 0;
        int max = 0;
        int low = 0;
        int high = height.length - 1;
        while(low < high){
            int area = Math.min(height[low], height[high]) * (high-low);
            max = Math.max(max, area);
            if(height[low] < height[high]){
                low++;
            } else {
                high--;
            }
        }
        return max;
    }
}
