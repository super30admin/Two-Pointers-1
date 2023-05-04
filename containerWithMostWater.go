// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

/*

Approach:
We use 2 pointer approach to find the max area. We start the pointers on the
extreme ends and calculate the area. This would maximize the width initially.
To maximize the heights, we keep moving the pointer which has the lower height
in each iteration, so that we could keep finding the max height.

*/

package main

func maxArea(height []int) int {
	if len(height) <= 1 {
		return 0
	}

	left, right := 0, len(height)-1
	maxArea := 0

	for left < right {
		maxArea = max(maxArea,
			(right-left)*min(height[left], height[right]))
		if height[left] <= height[right] {
			left++
		} else {
			right--
		}
	}

	return maxArea
}

func max(a, b int) int {
	if a > b {
		return a
	}
	return b
}

func min(a, b int) int {
	if a < b {
		return a
	}
	return b
}
