"""
Problem 2: 3Sum (https://leetcode.com/problems/3sum/)
TC: O(n^2)
SC: O(1)
Approach: Sort the array. Use two pointers to find the sum of three numbers.
"""
from typing import List


class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums = sorted(nums)
        result = []
        for i in range(len(nums)):
            if i > 0 and nums[i] == nums[i - 1]:
                continue
            lo = i + 1
            hi = len(nums) - 1

            while lo < hi:
                if nums[i] + nums[lo] + nums[hi] == 0:
                    result.append([nums[i], nums[lo], nums[hi]])

                    lo += 1
                    hi -= 1

                    while lo < hi and nums[lo] == nums[lo - 1]:
                        lo += 1
                    while lo < hi and nums[hi] == nums[hi + 1]:
                        hi -= 1

                elif nums[i] + nums[lo] + nums[hi] > 0:
                    hi -= 1
                else:
                    lo += 1

        return result