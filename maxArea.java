// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

    func maxArea(_ height: [Int]) -> Int {
       var left = 0
      var right = height.count-1
        var maxAns = 0
        while left < right {
            maxAns = max(min(height[left],height[right])*(right-left),maxAns)
            if height[left] > height[right] {
                right -= 1
            } else {
                left += 1
            }
        }
        
        return maxAns
    }