package twoPointers1;

public class ContainerWithMostWater {
	//Time Complexity : O(n), where n is the length of height
	//Space Complexity : O(1)
	//Did this code successfully run on Leetcode : Yes
	//Any problem you faced while coding this : Two Pointer approach
	public int maxArea(int[] height) {
        int max = 0;
        int i = 0, j = height.length - 1;
        
        while(i <= j) {
            max = Math.max(max, Math.min(height[i], height[j]) * (j - i));
            if(height[i] < height[j])
                i++;
            else
                j--;
        }
        
        return max;
    }
	
	//Time Complexity : O(n^2), where n is the length of height - TLE
	//Space Complexity : O(1)
	//Did this code successfully run on Leetcode : Yes
	//Any problem you faced while coding this : No
	public int maxArea2(int[] height) {
        int max = 0;
        
        for(int i=0; i<height.length - 1; i++) {
            for(int j=i + 1; j<height.length; j++) {
                max = Math.max(max, Math.min(height[i], height[j]) * (j - i));
            }
        }
        
        return max;
    }
	
	//Time Complexity : O(2^n), where n is the length of height - Recursion Optimization
	//Space Complexity : O(n), for recursion stack
	//Did this code successfully run on Leetcode : Yes
	//Any problem you faced while coding this : Better recursion that passes all test cases
	public int maxArea3(int[] height) {
        return helper3(height, 0, height.length - 1, 0);
    }
    
    private int helper3(int[] height, int i, int j, int max) {
        // base
        if(i > j)
            return max;
        
        // logic
        int area = Math.min(height[i], height[j]) * (j - i);
        max = Math.max(area, max);
        // left
        if(height[i] < height[j])
            return helper3(height, i + 1, j, max);
        else
        // right
            return helper3(height, i, j - 1, max);
    }
	    
	//Time Complexity : O(2^n), where n is the length of height - TLE
	//Space Complexity : O(n), for recursion stack
	//Did this code successfully run on Leetcode : Yes
	//Any problem you faced while coding this : No
	public int maxArea4(int[] height) {
        return helper4(height, 0, height.length - 1, 0);
    }
    
    private int helper4(int[] height, int i, int j, int max) {
        // base
        if(i > j)
            return max;
        
        // logic
        int area = Math.min(height[i], height[j]) * (j - i);
        max = Math.max(area, max);
        // left
        int case1 = helper4(height, i + 1, j, max);
        
        // right
        int case2 = helper4(height, i, j - 1, max);
        
        return Math.max(case1, case2);
    }
}
