"""
## Problem2 (https://leetcode.com/problems/3sum/)
"""


from typing import List
from collections import defaultdict

class Solution:
    # TC: O(n^2)
    # SC: O(n)
    def twoSum(self, nums,i, res ):
        seen = set()
        j = i + 1
        
        while (j < len(nums)):
            complement = -nums[i] - nums[j]
            if ( complement in seen):
                res.append([nums[i], nums[j], complement])
                
                while j + 1 < len(nums) and nums[j] == nums[j+1]:
                    j += 1
                    
            seen.add(nums[j])
            j += 1
        
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        res  = []
        nums.sort()
        
        for i in range(len(nums)):
            if nums[i] > 0:
                break
                
            if i == 0 or nums[i-1] != nums[i]:
                self.twoSum(nums, i, res)
                
        return res



# Approach 2: TC O(n^2) SC O(1)
    def twoSum(self, nums,i, res ):

        ptr1 = i + 1
        ptr2 = len(nums) - 1
        target = -nums[i]
        
        while (ptr1 < ptr2):
            sums_ = nums[ptr1] + nums[ptr2]
            if (target == sums_):
                res.append([nums[ptr1], nums[ptr2], nums[i]])
                
                ptr1 += 1
                ptr2 -= 1
                
                while(ptr1 < ptr2 and nums[ptr1] == nums[ptr1 - 1]):
                    ptr1 += 1
                
                while (ptr1 < ptr2 and nums[ptr2] == nums[ptr2 + 1]):
                    ptr2 -= 1
                
                
            elif (sums_ > target ):
                ptr2 -= 1
                
            else:
                ptr1 += 1
                
            
                
                
            
                
        
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        res  = []
        nums.sort()
        
        for i in range(len(nums)):
            if nums[i] > 0:
                break
                
            if i == 0 or nums[i-1] != nums[i]:
                self.twoSum(nums, i, res)
                
        return res
        
