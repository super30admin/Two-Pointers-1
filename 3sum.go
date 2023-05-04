// Time Complexity : O(n^2) (because of the 2 loops,
//     and the sorting takes O(n*log(n)), which is included in this)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

/*

Approach:
We use the 2 pointer approach in finding the triplets.
First, we sort the array so that we can apply the 2 pointer based approach.
The outer loop just iterates over the array and acts as the first element of
the triplet.
For the remaining 2 triplets, we use the two sum method, but instead of 2
elements, we sum the outer loop element along with the low and high pointer
elements. If they sum to 0, then we add that triplet to the result array.
Note that we skip the elements in each loop if they are the same as the
previous one.

*/

package main

import "sort"

func threeSum(nums []int) [][]int {
	if len(nums) == 0 {
		return [][]int{}
	}

	// sort first so that we can apply 2 pointer
	sort.Ints(nums) // O(n*log(n))

	n := len(nums)
	ans := [][]int{}
	for i := 0; i < n; i++ {
		if nums[i] > 0 {
			break // because a sum of 0 is not possible anymore
		}
		if i != 0 && nums[i] == nums[i-1] {
			continue // skip same elements
		}
		for j, k := i+1, n-1; j < k; {
			s := nums[i] + nums[j] + nums[k]
			if s == 0 {
				ans = append(ans, []int{nums[i], nums[j], nums[k]})
				j++
				k--
				// move j and k so that same elements are skipped
				for j < k && nums[j] == nums[j-1] {
					j++
				}
				for j < k && nums[k] == nums[k+1] {
					k--
				}
			} else if s > 0 {
				k--
			} else {
				j++
			}
		}
	}

	return ans
}
