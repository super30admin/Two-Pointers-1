// Time Complexity : O(n) n- number of elements in the array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


public class ContainerWithMostWater {
	public int maxArea(int[] height) {
        
        //edge
        if(height == null || height.length == 0)
            return 0;
        
        //2 pointer approach
        int maxArea=0;
        int i=0, j=height.length-1;
        
        while(i<j) {
            int area = Math.min(height[i], height[j]) * (j-i);
            maxArea = Math.max(maxArea, area);
            if(height[i] <= height[j])
                i++;
            else 
                j--;
        }
        return maxArea;
    }
}