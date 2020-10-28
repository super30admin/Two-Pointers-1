// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach
/*
use 3 pointers l m =0 and h = last index
check while m <=h
if m has 2 value the swap with h and reduce h
if m is 1 just increment m
else swap m and l element and  increment both
*/

package main

import "fmt"

func sortColors(nums []int)  {
	fmt.Println(nums)
	l, m, h := 0, 0, len(nums) - 1
	for m <= h {
		if nums[m] == 2 {
			temp := nums[m]
			nums[m]= nums[h]
			nums[h]= temp
			h--
		} else if nums[m] == 1 {
			m++
		} else {
			temp := nums[m]
			nums[m]= nums[l]
			nums[l]= temp
			l++
			m++
		}
	}
	fmt.Println(nums)
}

func MainSortColor() {
	sortColors([]int {2,0,2,1,1,0}) //expected  [0,0,1,1,2,2])
}
