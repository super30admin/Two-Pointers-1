package main

/*
   approach: 2 pointers ( one on each side )
   - we are basically looking for a container that has the max widht given height and width
   - with 2 pointers, we will have to pick and choose from 2 heights
       - do we pick the left or right height
       - well, container will only hold water until the smallest height, it will start flowing over if water exceeds the smaller height
       - therefore between the 2 heights ( left and right ) -- we will pick the smaller one.
   - To get the widht - this is just windowSize but not the +1 at the end ( right - left )
   - Then save the max area as needed
   - finally return the max

   time: o(n)
   space: o(1)
*/
func maxArea(height []int) int {
	max := 0
	left := 0
	right := len(height) - 1

	for left < right {
		h := min(height[left], height[right])
		w := right - left
		area := h * w
		if area > max {
			max = area
		}
		if height[left] < height[right] {
			left++
		} else {
			right--
		}
	}
	return max
}

func min(x, y int) int {
	if x < y {
		return x
	}
	return y
}
