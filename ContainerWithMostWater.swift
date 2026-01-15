//
//  TrapRainWater.swift
//  DSA-Practice
//
//  Created by Paridhi Malviya on 1/7/26.
//

/*
 heights array = [1, 8, 6, 2, 5, 4, 8, 3, 7]
 Area = h * w
 naive - nested iterations from each elemnt. keep the global value for maximum area. O(n2) Need to remove these.
 effective height - lesser height. because we have to consider the lesser height. whch can contain water.
 go away from smalller height.
 width will decrease when we move pointers.
 
 time complexity - O(n)
 when left adn right pointers meet, stop the
 
 Tactic - nested iterations are getting eliminated if we check 1 and 7 only. nested iterations from 1 can be eliminated. because the area will be squizzed if we move right pointer. 1 was constraining height.
 we explored maximum area from 1. we can confidently move our left pointer
 
 2nd aread = 7 * 7 = 49. left pointer height = 8. right pointer height - 7. so effective height - 7
 width = right pointer index - left pointer index.
 height - effective height
 
 2 pointer - move either left or right or both.
 
 O(n)
 */
class ContainerWithMaxArea {
    
    init() {
       let area = maxAreaBruteOptimized(heights: [1, 8, 6, 2, 5, 4, 8, 3, 7])
       print("area \(area)")
    }
    
    func maxAreaBruteforce(heights: [Int]) {
        let n = heights.count
        var maximum = 0
        for i in 0..<n {
            for j in (i + 1)..<n {
                let currentArea = min(heights[i], heights[j]) * (j - i)
                maximum = max(maximum, currentArea)
            }
        }
    }
    
    func maxAreaBruteOptimized(heights: [Int]) -> Int {
        let n = heights.count
        var maximum = 0
        var left = 0
        var right = n - 1
        
        //This is to find the indices which contains the maximum area
        var start = 0
        var end = 0
        
        //heights[left] == heights[right], we can move either left or right pointer. Both will work
        while (left < right) {
            let currentArea = min(heights[left], heights[right]) * (right - left)
            
            if (maximum < currentArea) {
                maximum = currentArea
                start = left
                end = right
            }
            
            maximum = max(maximum, currentArea)
            if (heights[left] <= heights[right]) {
                left += 1
            } else {
                right -= 1
            }
        }
        print("start \(start) *** end \(end)")
        return maximum
    }
}
