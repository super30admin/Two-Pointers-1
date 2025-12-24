/*
11. Container With Most Water
Ran on leetcode: Yes
TC: O(n) SC: O(1)
Start with max width, low pointer on first element and high pointer on last element, if height on low pointer is smaller than on high pointer move the low pointer and vice versa, since height is the limiting factor and we already have the max width. At each point calculate area and update max if necessary.
*/
class Solution {
    public int maxArea(int[] height) {
        // Set to max width
        int low = 0, high = height.length - 1;
        
        int area = Integer.MIN_VALUE;

        while(low < high){

            int width = high - low; // Find the distance
            int minHeight = Math.min(height[low], height[high]); // Find the limiting height
            area = Math.max(area, width * minHeight); // Store area, if it is new max

            if(height[low] < height[high]){ // height on low index is limiting
                low++;
            } else { // height on high index is limiting
                high--;
            }

        }

        return area;
    }
}