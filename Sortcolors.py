"""
Leetcode - Running
Time complexity - O(N^2)
This problem can be solved using bubble-sort. Just use two for loops and maintain two pointers i and j
at every point check for the condition if true swap else pass.
"""

class Solution(object):
    def sortColors(self, nums):
        for i in range(len(nums)):
            for j in range(len(nums)-i-1):
                if nums[j] > nums[j+1]:
                    nums[j], nums[j+1] = nums[j+1], nums[j]