// Time Complexity : O(n)
// Space Complexity : O(1) since it is sorted in place
// Did this code successfully run on Leetcode : Yes

/*

Approach:
We use 3 pointers (low, mid, high) for each of the colors. We move the mid
pointer only when we know that each element it encounters is sorted in the
right place. This approach also relies on the low and high pointers to be at
0th and n-1th positions respectively, as they will always point to the lowest
and highest parts of the array respectively.

*/

package main

func sortColors(nums []int) {
	if len(nums) == 0 {
		return
	}

	// consider 3 pointers for each of the three colors
	// low=0=red, mid=1=white, high=2=blue
	low, mid, high := 0, 0, len(nums)-1

	for mid <= high {
		if nums[mid] == 1 {
			mid++
		} else if nums[mid] == 2 {
			// swap mid and high
			temp := nums[mid]
			nums[mid] = nums[high]
			nums[high] = temp
			high--
		} else if nums[mid] == 0 {
			temp := nums[mid]
			nums[mid] = nums[low]
			nums[low] = temp
			low++
			mid++
		}
	}
}
