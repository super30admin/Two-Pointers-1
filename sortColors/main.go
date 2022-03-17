package main

// time: o(n)
// space: o(1)
func sortColors(nums []int) {

	// left == 0
	// middle == 1
	// right == 2

	left := 0
	right := len(nums) - 1
	mid := 0

	for mid <= right {
		if nums[mid] == 2 {
			nums[mid], nums[right] = nums[right], nums[mid]
			right--
		} else if nums[mid] == 0 {
			nums[mid], nums[left] = nums[left], nums[mid]
			left++
			mid++
		} else {
			mid++
		}
	}

}
