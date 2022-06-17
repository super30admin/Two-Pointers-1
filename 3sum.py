'''
-- Passed Test Cases on LeetCode
'''
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
    #O(n^2) -- Time Complexity; O(logn) -- Best case Space complexity and O(n) Worst case Space complexity
        res = []
        nums.sort()
        for i in range(len(nums)):
            if nums[i] > 0:
                break
            if i == 0 or nums[i - 1] != nums[i]:
                self.twoSum(nums, i, res)
        return res
                
    def twoSum(self, nums, i, res):
        low = i + 1
        high = len(nums) - 1
        while(low < high):
            sum = nums[i] + nums[low] + nums[high]
            if sum < 0:
                low += 1
            elif sum > 0:
                high -= 1
            else:
                res.append([nums[i], nums[low], nums[high]])
                low += 1
                high -= 1
                while low < high and nums[low] == nums[low - 1]:
                    low += 1
                    
        
        
        
        
