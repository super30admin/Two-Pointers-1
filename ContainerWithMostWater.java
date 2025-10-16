// 11. Container With Most Water
// https://leetcode.com/problems/container-with-most-water/description/

/**
 *  Time Complexity: O(n) since we iterate over all elements
 * 
 *  Space Complexity: O(1) as we don't take any linear space
 */

class Solution {
    public int maxArea(int[] height) {

        int max = 0;

        int low = 0;
        int high = height.length - 1;

        while(low < high){
            int area = Math.min(height[low], height[high]) * (high - low); // length * breadth

            max = Math.max(max, area); // update max if area is greater

            // move away from lower height
            if(height[low] <= height[high]){ 
                low++;
            }else{
                high--;
            }
        }

        return max;
    }
}