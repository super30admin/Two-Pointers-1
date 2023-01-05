package main

import "sort"

/*
   approach: sort + two ptrs
   - sort the entire array
   - for each ith element
       - we will run a two pointer to search for a target ( two pointer search on sorted array like two sum ii )
       - what will be the target
       - 2 ways;
           1. target can be 0-nums[i] ( where i is the outter i )
           2. target can be discovered by summing all 3 numbers ( i, left, right )

   time: o(nlogn) + o(n^2) = o(n^2)
   space: o(1)
*/
func threeSum(nums []int) [][]int {
	sort.Ints(nums)
	result := [][]int{}
	for i := 0; i < len(nums); i++ {
		if i != 0 && nums[i] == nums[i-1] {
			continue
		}
		// target := 0 - nums[i]
		target := 0
		left := i + 1
		right := len(nums) - 1
		for left < right {
			sum := nums[i] + nums[left] + nums[right]
			if sum == target {
				result = append(result, []int{nums[i], nums[left], nums[right]})
				left++
				right--
				for left < right && nums[left] == nums[left-1] {
					left++
				}
				for left < right && nums[right] == nums[right+1] {
					right--
				}
			} else if sum > target {
				right--
			} else {
				left++
			}
		}
	}
	return result
}

// for each ith element, do twoSum using complement search
// what will be the target for the twoSum complement search;
//  - what number do we need to add to ith element for it to equal to 0
//  - 0-ithNumber
// so our twoSum complement search will search for 0-ithNumber ( i being the outerloop idx )
// time : o(n) * o(n) = o(n^2)
// func threeSum(nums []int) [][]int {
//     out := [][]int{}
//     set := map[int]struct{}{}
//     outSeen := map[string]struct{}{}

//     for i := 0; i < len(nums); i++ { // o(n)
//         outterNum := nums[i]
//         if _, ok := set[outterNum]; ok {continue}
//         set[outterNum] = struct{}{}
//         target := 0-outterNum

//         seen := map[int]struct{}{}
//         for j := i+1; j < len(nums); j++ { // o(n)
//             compl := target-nums[j]
//             if _, ok := seen[compl]; ok {
//                 triplet := []int{outterNum, nums[j], compl}
//                 sort.Ints(triplet) // (o3log3)
//                 // gross :/
//                 if _, ok := outSeen[fmt.Sprintf("%v", triplet)]; ok {continue}
//                 outSeen[fmt.Sprintf("%v", triplet)] = struct{}{}
//                 out = append(out, triplet)
//             }
//             seen[nums[j]] = struct{}{}
//         }
//     }
//     // total time = o(n) x o(n) x o(3log3) = o(n^2)
//     // space = o(n) + o(n) + o(n) ; 3 sets
//     return out
// }
