package com.exmaple.problems;
// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
 // Any problem you faced while coding this :


// Your code here along with comments explaining your approach
//Two Pointer Approach is utilized to solve this problem..

public class ContainerMostWater {
	public int maxArea(int[] height) {
		int maxarea = 0, l = 0, r = height.length - 1;
		while (l < r) {
			maxarea = Math.max(maxarea, Math.min(height[l], height[r]) * (r - l));
			if (height[l] < height[r])
				l++;
			else
				r--;
		}
		return maxarea;
	}
	
	public static void main(String args[]) {
		int arr[] = {1,8,6,2,5,4,8,3,7};
		ContainerMostWater area = new ContainerMostWater();
		System.out.print(area.maxArea(arr));
	}
}
