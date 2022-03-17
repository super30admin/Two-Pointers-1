package main

import "sort"

// o(nlogn) + o(n) x o(n) = onlogn + o(n^2)
// time: o(n^2)
// space: o(1)
func threeSum(nums []int) [][]int {

	if nums == nil || len(nums) == 0 {
		return nil
	}

	out := [][]int{}
	sort.Ints(nums) // NlogN

	// o(n)
	for i := 0; i < len(nums); i++ {
		if i != 0 && nums[i] == nums[i-1] {
			continue
		}

		left := i + 1
		right := len(nums) - 1

		// o(n)
		for left < right {
			sum := nums[i] + nums[left] + nums[right]
			if sum == 0 {
				out = append(out, []int{nums[i], nums[left], nums[right]})
				left++
				right--
				for left < right && nums[left] == nums[left-1] {
					left++
				}
				for left < right && nums[right] == nums[right+1] {
					right--
				}
			} else if sum > 0 {
				right--
			} else {
				left++
			}
		}
	}
	return out
}
