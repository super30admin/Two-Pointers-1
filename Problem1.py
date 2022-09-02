# ## Problem1 (https://leetcode.com/problems/sort-colors/)
from ast import List


class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        for i in range (0,len(nums)-1):
            for j in range (i+1,len(nums)):
                if (nums[i] > nums[j]):
                    nums[i],nums[j] = nums[j], nums[i]
        
        