// Time Complexity : O(n2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach
/*
first sort the array
then loop from 0 to len -2
for each if nums[i] > 0 you can break there wont be any more groups
if element is not as same as the previous then unique can be found
set l = i + 1 and h as last index
till l < h
if sum of value of index i, l, h ==0 add to return list increment l, decrement h till they are not same as before
if sum > 0 decrement h
else increment l
*/
package main

import (
	"fmt"
	"sort"
)

func threeSum(nums []int) [][]int {
	res := [][]int{}
	if len(nums) == 0  || len(nums) == 1 {
		return res
	}
	sort.Ints(nums)
	fmt.Println(nums)
	for i:=0;i<len(nums) - 2;i++ {
		if nums[i] > 0 {
			break
		}
		if i == 0 || i > 0 && nums[i] !=nums[i-1] {
			l := i + 1
			h := len(nums) - 1
			for l < h {
				sum := nums[i] + nums[l] + nums[h]
				if  sum == 0 {
					res = append(res, []int{nums[i], nums[l], nums[h]})
					l++
					h--
					for l < h && nums[l] == nums[l - 1] {
						l++
					}
					for l < h && nums[h] == nums[h + 1] {
						h--
					}
				} else if sum > 0 {
					h--
				} else {
					l++
				}
			}
		}
	}
	return res
}

func Main3Sum() {
	fmt.Println(threeSum([]int {-1,0,1,2,-1,-4}))// [[-1,-1,2],[-1,0,1]]
}
