//Time Complexity: O(n)
//Space Complexity: O(1)
//For this problem, we use the approach of two pointers. One of the pointers is set to the extreme left and the other to the extreme
//right of the given array. Since the lower height is the constraining height, we can move the pointer that has a lower height out of 
// the two pointers. In such a way we are able to find the max Area of the container by getting rid of the nested calculations.

class Solution {
    public int maxArea(int[] height) {
        if(height == null || height.length == 0) return 0;
        int max = 0;
        int low = 0; int high = height.length - 1;
        while(low < high){
            max = Math.max(max, Math.min(height[low],height[high]) * (high - low));
            if(height[low] < height[high]){
                low++;
            }else{
                high++;
            }
        }
        return max;
    }
}