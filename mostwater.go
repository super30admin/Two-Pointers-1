// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach
/*
set m = 0
set l, h as 0 and last index
while  l < h
set m as maximum of m and minheight between l,h multiplied by h-l(width)
if value at l < h then increment l
else decrement h
*/
package main

import "fmt"

func maxArea(height []int) int {
	m := 0
	l, h := 0, len(height) - 1
	for l < h {
		m = max(m, min(height[l], height[h]) * (h - l))
		if height[l] < height[h] {
			l++
		} else {
			h--
		}
	}
	return m
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

func MainMaxWater() {
	fmt.Println(maxArea([]int {1,8,6,2,5,4,8,3,7})) // expected 49
}
