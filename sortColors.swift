// Time Complexity : (O)n
// Space Complexity : (O)1
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : wrong answer for [2,0,1], [1,2,0]. the condition checking is wrong .checked for nums[mid] == 1 and increased mid in else case 

//keep three pointer low, mid and high
//keep the low pointer and mid pointer in starting position and high pointer in ending position
//idea is to move the mid pointer based on the mid point value. if is equal to 2 then swap with high else swap with low
//if mid value is equal to 1 then move the mid pointer

class Solution {
    
    func sortColors(_ nums: inout [Int]) {
        var low = 0
        var mid = 0
        var high = nums.count-1
        
        while mid <= high {
            if nums[mid] == 1 {
                mid += 1
            } else if nums[mid] == 0 {
                swap(&nums, low, mid)
                low += 1
                mid += 1
            } else {
                swap(&nums, mid, high)
                high -= 1
            }
        }
        
    }
    
    private func swap(_ nums: inout[Int], _ i: Int,_ j: Int ) {
        let temp = nums[i]
        nums[i] = nums[j]
        nums[j] = temp
    }
}