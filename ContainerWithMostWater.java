//TC: O(n)
//SC: O(1)
//Approach:
// As we need to get the max area, and smaller height gets to decide the area for that particular combination, while iterating, we move that pointer which points
// to the smaller height from low and high. This way, we make sure that by moving smaller height pointer, I may get towards bigger heights and hence bigger area
// or if there are no bigger heights, then I already have the bigger area.

class Solution {
    public int maxArea(int[] height) {
        int res = 0;
        int low = 0;
        int high = height.length - 1;
        while(low < high){
            int area = Math.min(height[low], height[high]) * (high - low);
            res = Math.max(res, area);
            if(height[low]<height[high]){
                low++;
            }
            else{
                high--;
            }
        }
        return res;
    }
}
