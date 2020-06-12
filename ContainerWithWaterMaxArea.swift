// Time Complexity : (O)n
// Space Complexity : (O)1
// Did this code successfully run on Leetcode : yes
//Used two pointer technique to find the maximum area
//Have low pointer from left side and high pointer from right side
// move low pointer if its low otherwise decrease high pointer
//set max area from currentArea and previous maximum area


class Solution {
    func maxArea(_ height: [Int]) -> Int {
        if height.count < 2 {
            return 0
        }
        var low = 0
        var high = height.count-1
        var maximumArea:Int = 0

        while low < high {
          var currentArea = 0
          if height[low] < height[high] {
              currentArea =  (high - low) * height[low]
              low += 1
          } else {
              currentArea =  (high - low) * height[high]
              high -= 1
          }
          maximumArea = max(maximumArea, currentArea)
        }
        return maximumArea
    }
}