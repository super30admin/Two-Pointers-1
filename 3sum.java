// Time Complexity : O(N^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

   func threeSum(_ nums: [Int]) -> [[Int]] {
        if nums.count < 3 || nums == nil {
            return []
        }
        var output = [[Int]]()
        var nums = nums.sorted()
        for i in 0..<nums.count {
            if (i != 0 && nums[i] == nums[i-1]) {
                continue
            }
            var left = i + 1
            var right = nums.count - 1
            while left < right {
                var sum = nums[i] + nums[left] + nums[right] 
                if sum == 0 {
                    output.append([nums[i],nums[left],nums[right]])
                    left += 1
                    right -= 1
                    while left < right && nums[left-1] == nums[left] { left += 1 }
                    while left < right && nums[right+1] == nums[right] { right -= 1 }
                } else if sum < 0 {
                    left += 1
                } else {
                    right -= 1
                }
            }
        }
        return output
    }