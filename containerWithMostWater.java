/*
 * Leet code - 11
 */
class Solution {
    public int maxArea(int[] height) {
        
        int start = 0;
        int end = height.length-1;
        int computedArea = 0;
        // 2-pointer technique
        while(start < end)
        {
            computedArea = Math.max(computedArea, (end-start)*Math.min(height[start],height[end]));
            if(height[start] < height[end])
                start=start+1;
            else if(height[end] < height[start])
                end = end - 1;
            // move either start or end in case they are equal
            else
                start = start + 1;
        }
        return computedArea;
    }
}