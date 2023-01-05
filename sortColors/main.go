package main

// time : o(n)
// space: o(1)
func sortColors(nums []int) {
	left := 0
	right := len(nums) - 1
	i := 0
	for i <= right {
		if nums[i] == 2 {
			nums[i], nums[right] = nums[right], nums[i]
			right--
		} else if nums[i] == 0 {
			nums[i], nums[left] = nums[left], nums[i]
			i++
			left++
		} else {
			i++
		}
	}
}
