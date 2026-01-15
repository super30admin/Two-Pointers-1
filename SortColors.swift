//
//  ArrangeColors.swift
//  DSA-Practice
//
//  Created by Paridhi Malviya on 1/7/26.
//

/*
 using 3 pointers - we can sort it in a single pass.
 We can't go ahead for furhter pointers. We can extrapolate to have 100 pointers....
 All sortnig algorithm could be O(n) then.
 But we need to use sorting algorithm for this kind of requirement. which is O(n log n)
 
 //segregate 0, 1, and 2
 have 2 pointers.
 lef tis collecting all 0s,
 right is collecting all 2s
 mid will be itertaitn gthrough the array
 if (nums[mid] == nums[right]) {
 swap element at mid with the one at right
 right -= 1
 } else if (nums[mid] == 0) {
    swap mid element with left element
    left += 1, mid += 1
 } else if (nums[mid == 1]){
    mid += 1
 }
 
 mid and right has crossed each other so stop.
 while (mid <= right ) {
 }
 
 O(n) -> single pass algorithm for sorting colors
 */

class SortColors {
    
    init() {
      var array = [2, 0, 2, 1, 1, 0]
//        var array = [1, 2, 0]
        let sortedNums = sortColors(&array)
        print("array \(sortedNums)")
    }
    
    func sortColors(_ nums: inout [Int]) -> [Int] {
        var nums = nums
        let n = nums.count
        var left = 0
        var right = n - 1
        var mid = 0
        
        while (mid <= right) {
            if (nums[mid] == 2) {
                nums.swapAt(mid, right)
                right -= 1
            } else if (nums[mid] == 0) {
                nums.swapAt(mid, left)
                left += 1
                mid += 1
            } else {
                mid += 1
            }
        }
        return nums
    }
}
