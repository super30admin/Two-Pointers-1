// Time Complexity : O(n), n is the length of the array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/**
 * 1. Use two pointers approach to find the max area.
 * 2. Calculate the area using the min of the two heights and the width.
 * 3. If the left height is less than the right height, increment the left pointer. Else, decrement the right pointer.
 * 4. Return the max area.
 */

class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int low = 0, high = n-1;
        int max = 0;

        while(low < high){
            int h = Math.min(height[low], height[high]);
            int w = high - low;
            int area = h * w;
            max = Math.max(max, area);
            if(height[low] < height[high]){
                low++;
            }else{
                high--;
            }
        }

        return max;
    }
}