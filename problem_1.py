"""
Problem 1: Sort Colors (https://leetcode.com/problems/sort-colors/)
TC: O(n)
SC: O(1)
Approach: Use three pointers to keep track of 0, 1 and 2. Move the pointers accordingly.

"""
from typing import List


class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        l = 0
        r = len(nums)-1
        extra = 0
        while extra<=r:
            if nums[extra] == 0:
                nums[l],nums[extra] = nums[extra],nums[l]
                l+=1
                extra+=1
            elif nums[extra] == 2:
                nums[r],nums[extra] = nums[extra],nums[r]
                r-=1
            else:
                extra+=1