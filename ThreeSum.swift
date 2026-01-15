//
//  ThreeSum.swift
//  DSA-Practice
//
//  Created by Paridhi Malviya on 1/11/26.
//

/*
 find triplet sum of which can give a particular target.
 avoid duplicate triplet.
 By sorting the triplet numbers
  
 bruteforce - native - have nested triple iterations. n3. O(n) space for hash set.
 fix 1 pointer. On rest of the array, do 2 sum. 2 sum can be implmented using 2-pointer.

 optimized Approach 1 -> using hash set
 time complexity - O(n2)  space -> O(n)
 
 hashing of string -> aba -> prime for each character character
 
Optimized approach 2 -> sort the array. Fix a pointer i at 1 element i.e. k. have left pointer and right pointer. check for 2 sum for (target - k) sum
 move to next unique element.
 When left pointer crosses right pointer, we will be done.
 Keep on moving the pointer i (remove external duplicacy) - move until we get a next unique element
 Stop when we get the value as 1. We can stop. We can never get sum =0
 O(n2) + O (n log n)
 space - O(1)
 
 Binary search solution - O(n2 logn n) -
 */

class ThreeSum {
    
    init() {
        let resultArray = threeSum(nums: [-1, 0, 1, 2, -1, -4])
        print("result : \(resultArray)")
        
        let resultArrayUsingHashing = threeSumUsingHashing(nums: [-1, 0, 1, 2, -1, -4], target: 0)
        print("resultArrayUsingHashing \(resultArrayUsingHashing)")
    }
    
    func threeSum(nums: [Int]) -> [[Int]] {
        if (nums.count < 3) {
            return [[]]
        }
        let n = nums.count
        var result = [[Int]]()
        
        let sortedNums = nums.sorted(by:<) //-4, -1, -1, 0, 1, 2
        
        for i in 0..<n {
            if (sortedNums[i] > 0) {
                break
            }
            //to avoid external duplicacy
            if (i > 0 && sortedNums[i] == sortedNums[i - 1]) {
                continue
            }
            var left = i + 1
            var right = n - 1
            //left and right should not cross each other.
            while (left < right) {
                let sum = sortedNums[i] + sortedNums[left] + sortedNums[right]
                
                if (sum == 0) {
                    //get the triplet
                    let triplet: [Int] = [sortedNums[i], sortedNums[left], sortedNums[right]]
                    result.append(triplet)
                    left += 1
                    right -= 1
                    //we don't want to repeat the duplicacy
                    //If we are mutating the base values then check the base case values again.
                    while (left < right && sortedNums[left] == sortedNums[left - 1]) {
                        left += 1
                    }
                    
                    while (left < right && sortedNums[right] == sortedNums[right + 1]) {
                        right -= 1
                    }
                } else if (sum < 0) {
                    left += 1
                } else {
                    //sum > 0
                    right -= 1
                }
            }
        }
        return result
    }
    
    func twoSum(sortedNums: [Int], i: Int, results: inout [[Int]]) {
        var seen = Set<Int>()
        for j in (i + 1)..<sortedNums.count {
            let complement = -sortedNums[i] - sortedNums[j]
            if seen.contains(complement) {
                results.append([sortedNums[i], sortedNums[j], complement])
                // Optionally, skip duplicates of nums[j]
//                while (j + 1 < sortedNums.count && sortedNums[j] == sortedNums[j + 1]) {
//                    continue
//                }
            }
            // Record current number for future complements
            seen.insert(sortedNums[j])
        }
    }
    
    func threeSumUsingHashing(nums: [Int], target: Int) -> [[Int]] {
        let sortedNums = nums.sorted()
        var results = [[Int]]()
        for i in 0..<sortedNums.count {
            if (i == 0 || sortedNums[i - 1] != sortedNums[i]) {
                twoSum(sortedNums: sortedNums, i: i, results: &results)
            }
        }
        return results
    }
}

