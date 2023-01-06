package main

// https://leetcode.com/problems/3sum/

/*

Todo : discuss other approaches later on, basically the brute force and o applying BS on the sorted array.

*/

// TC - nlogn for seach and O(n) for the outer loopx O(n) for the while loop --> max of both = O(n^2)
// Space : o(1)
func threeSum(nums []int) [][]int {
	// this is extra time - but this is needed for now
	sort.Ints(nums)

	//result array
	result := [][]int{}
	//arrayToAppend := []int{}

	for i := 0; i < len(nums); i++ {
		target := -nums[i]
		front := i + 1
		last := len(nums) - 1
		for front < last {
			sum := nums[front] + nums[last]
			if sum < target {
				front++
			}
			if sum > target {
				last--
			}
			if target == sum {
				arrayToAppend := []int{nums[i], nums[front], nums[last]}
				result = append(result, arrayToAppend)
				fmt.Println(arrayToAppend)
				for (front < last) && nums[front] == arrayToAppend[1] {
					front++
				}
				for front < last && nums[last] == arrayToAppend[2] {
					last--
				}
			}
			for i+1 < len(nums) && nums[i+1] == nums[i] {
				i++
			}
		}
	}
	return result
}
