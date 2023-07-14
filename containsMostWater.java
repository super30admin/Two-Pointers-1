class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int low = 0;
        int high = n-1;
        int max = 0;
        while(low < high){
            int volume = Math.min(height[low], height[high])* (high-low);
            max = Math.max(max,volume);
            if(height[high]<height[low]) high--;
            else low++;
        }
        return max;
    }
}