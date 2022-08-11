
"""
3-SUM


"""


class Solution:
    def threeSum(self, nums: list[int]) -> list[list[int]]:
        left  = 1
        right = len(nums)
        curr = 0

        for i in range(left, right):
        
            target = 0-nums[curr]



