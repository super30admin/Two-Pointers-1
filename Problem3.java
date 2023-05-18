// Time: O(n)
// Space: O(1)

class Solution {
    public int maxArea(int[] height) {
        int low  = 0;
        int high = height.length-1;
        int maxArea = -1;
        while(low<high){
            int area = 0;
            if(height[low]<height[high]){
                area = height[low] * (high-low);
                low++;
            }else{
                area = height[high] * (high-low);
                high--;
            }
            maxArea = Math.max(area, maxArea);
        }

        return maxArea;
    }
}