"""
time - n^2(log(n))
space - o(1)
we sort the array, we take three pointers, one main pointer that iterates through the array, another two where left starts
from main pointer +1 and right starts at the end. We take the complement as 0-nums[i] and using the left and right pointers
we find the two sum solution for the compliment.
"""

from typing import List


class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        print(nums)
        result = []
        for i in range(len(nums)):
            if nums[i] > 0:
                break
            if i > 0 and nums[i] == nums[i - 1]:
                continue
            two_sum = 0 - nums[i]
            l = i + 1
            r = len(nums) - 1
            while l < r:
                left = nums[l]
                right = nums[r]
                temp_sum = left + right
                if temp_sum == two_sum:
                    result.append([nums[i], nums[l], nums[r]])
                    while l < r and nums[l] == left:
                        l += 1
                    while l < r and nums[r] == right:
                        r -= 1
                elif temp_sum > two_sum:
                    while l < r and nums[r] == right:
                        r -= 1
                else:
                    while l < r and nums[l] == left:
                        l += 1
        return result
