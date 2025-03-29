// Time Complexity: O(N)
// Space Complexity: O(1) 
// Did this code successfully run on Leetcode: Yes
// Any problem you faced while coding this: No

// Approach:
// 1. Use two pointers, l (left) at the beginning and r (right) at the end of the array.
// 2. Calculate the area using Math.min(height[l], height[r]) * (r - l) and update the maximum area (op).
// 3. Move the pointer pointing to the smaller height to find a larger area.
// 4. Repeat until l meets r and return the maximum area found

public class ContainerWithMostWater {
    public int maxArea(int[] height) 
    {
        int l = 0;
        int r = height.length-1;
        int op = -1;
        while(l<r)
        {
            op = Math.max(op,Math.min(height[l],height[r]) * (r-l));
            if(height[l] <= height[r])
            {
                l++;
            }
            else
            {
                r--;
            }
        } 
        return op;
    }
}
