package main

import (
	"math"
)

// time: o(n)
// space: o(1)
func maxArea(heights []int) int {
	if heights == nil || len(heights) == 0 {
		return 0
	}

	left := 0
	right := len(heights) - 1

	max := 0
	for left < right {
		width := right - left
		height := int(math.Min(float64(heights[left]), float64(heights[right])))
		area := height * width

		if area > max {
			max = area
		}

		if heights[left] < heights[right] {
			left++
		} else {
			right--
		}

	}

	return max
}
