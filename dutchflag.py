"""
time - o(n)
space - o(1)
we take three pointers, one to iterate and two as place holders, left and right are placeholder pointers that keep a track of 0s and 2s
as and when the third pointer encounters a 0 or 2, we swap it with the left and right pointers, if it comes across a one we move the pointers
"""

from typing import List


class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        l, r, m = 0, len(nums) - 1, 0
        while m <= r:
            if nums[m] == 0:
                nums[l], nums[m] = nums[m], nums[l]
                l += 1
                m += 1
            elif nums[m] == 2:
                nums[m], nums[r] = nums[r], nums[m]
                r -= 1
            else:
                m += 1
