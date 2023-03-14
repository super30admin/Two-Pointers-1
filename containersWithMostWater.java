/*
Time Complexity - O(n) where n is the size of the array.
Space complexity - O(1).
 */
class Solution {
    public int maxArea(int[] height) {
        
        int maxArea = Integer.MIN_VALUE;
        int low = 0, high = height.length - 1;

        while(low < high) {
            maxArea = Math.max(maxArea, Math.min(height[low], height[high]) * (high - low));
            if(height[low] < height[high])
                low++;
            else
                high--;
        }

        return maxArea;

    }
}
