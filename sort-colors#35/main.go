package main

// https://leetcode.com/problems/sort-colors/description/

/*

Possible Solutions

- Bucket Sort - but since we cant use this we are not going to : but in this what you essentially do is keep a counter for each number you get and increment it by one
- Two Pointers
    - How? i mean call it 3 pointers rather
    - high pointer is responsible for collecting all 2's
    - low is responsible to collect all 0's
    - mid is responsible to collect all 1's
- Brute Force : how? will require some space but possible using two pass - this might be bucket sort only.
-


*/

// TC : O(n) : n is the number of elements
// Space : 0(1)
func sortColors(nums []int) {
	mid, low := 0, 0
	high := len(nums) - 1
	for mid <= high {
		if nums[mid] == 2 {
			temp := nums[high]
			nums[high] = nums[mid]
			nums[mid] = temp
			high--
		}
		if nums[mid] == 0 {
			temp := nums[low]
			nums[low] = nums[mid]
			nums[mid] = temp
			low++
			mid++
		}

		if nums[mid] == 1 {
			mid++
		}
		// high pointer should have 2's
	}
}

// func swap(low, high int, nums *[]int){
//     temp := nums[low]
// }

// TC is going to be more since we have two pass
// func sortColors(nums []int)  {
//     red := 0
//     white := 0
//     blue := 0
//     for i:=0;i<len(nums);i++{
//         if nums[i] == 0{
//             red++
//         }else if nums[i] == 1 {
//             white++
//         }else{
//             blue++
//         }
//     }
//     count := red+white+blue

//     for count != 0 {
//         for blue != 0 {
//             nums[count-1] = 2
//             blue--
//             count--
//         }
//         for white != 0{
//             nums[count-1] = 1
//             white--
//             count--
//         }
//         for red != 0{
//             nums[count-1] = 0
//             red--
//             count--
//         }
//     }
// }
