// Time Complexity : O(n) 
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : Yes

// Approach:
// 1. Initialize two pointers, low at the start and high at the end of the array.
// 2. Calculate the area using the heights at the low and high pointers, and update the maximum area.
// 3. Move the pointer pointing to the shorter line (either low or high) towards the other pointer to potentially find a larger area.


public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int n = height.length;
        int low = 0, high = n - 1;
        int area = 0;

        while(low < high){
            int h = 0;
            int w = high - low;

            if(height[low] < height[high]){
                h = height[low];
                low++;
            }else{
                h = height[high];
                high--;
            }

            area = Math.max(area, h * w);
        }

        return area;
    }
}
