package main

// https://leetcode.com/problems/container-with-most-water/

/*

Possible Solutions:
- Brute Force - two for loops and then we calc area using max(height) at outer and inner loop and difference between i and j
- Can we do it in one pass? Yes - suing two pointers


*/

// TC : O(N)
// Space : O(1)
func maxArea(height []int) int {
	low := 0
	high := len(height) - 1
	area := 0
	for low < high {
		length := high - low
		breadth := min(height[low], height[high])
		if length*breadth > area {
			area = length * breadth
		}
		if height[low] > height[high] {
			high--
		} else {
			low++
		}
	}
	return area
}

func min(a, b int) int {
	if a < b {
		return a
	}
	return b
}
