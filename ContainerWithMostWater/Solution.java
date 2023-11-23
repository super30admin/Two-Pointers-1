// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : No

/**
 * Use two pointer approach with incrementing low when height[low] is less than height[high] & using height[low] for the area, else decrementing high & using height[high] for
 * the area. Calculate the max at each iteration.
 */
class Solution {
    public int maxArea(int[] height) {

        int low = 0, high = height.length-1;
        int max = Integer.MIN_VALUE;

        while(low < high) {
            int area = 0;
            if(height[low] < height[high]) {
                area =  (high-low) * height[low];
                low++;
            }
            else {
                area =  (high-low) * height[high];
                high--;
            }
            max = Math.max(max, area);
        }

        return max;
    }
}



/*
// Time Complexity : O(N^2)
// Space Complexity : O(1)

class Solution {
    public int maxArea(int[] height) {

        int low = 0, high = height.length-1;
        int area = 0;

        for(int i=0; i<height.length-1; i++) {
            for(int j=i+1; j<height.length; j++) {
                area = Math.max(area, Math.min(height[i], height[j])*(j-i));
            }
        }

        return area;
    }
}*/
