// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None


public class mostWaterContainer {
    public int maxArea(int[] height) {
        int area = 0;
        int result = 0;
        
        int p1 = 0;
        int p2 = height.length - 1;
        
        while(p1 < p2) {

            area =  Math.min(height[p1],height[p2]) * (p2 - p1);
            result = Math.max(result, area);
            if(height[p1] < height[p2])
                p1++;
            else
                p2--;
        }
        return result;
    }
}
