"""
// Time Complexity : O(N^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
"""
class Solution:
    def threeSum(self, nums):
        
        result = []
        nums.sort()
        for i in range(len(nums)):
            if nums[i] > 0:
                break
            if i == 0 or nums[i-1] != nums[i]:
                self.twoSum(nums, i, result)
        return result
    
    def twoSum(self, nums, i, res):
        low = i + 1
        high = len(nums) - 1
        
        while(low < high):
            
            _sum = nums[low] + nums[high] + nums[i]
            if(_sum < 0):
                low += 1
            elif(_sum > 0):
                high -= 1
                
            else:
                res.append([nums[i], nums[low], nums[high]])
                low += 1
                high -= 1
                while low < high and nums[low] == nums[low - 1]:
                    low += 1