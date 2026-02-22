#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Sun Feb 22 14:01:34 2026

@author: rishigoswamy

    LeetCode 15: 3Sum
    Link: https://leetcode.com/problems/3sum/

    Approach:
    Sort + Two Pointers.

    Steps:
        1. Sort the array.
        2. Fix one number nums[i].
        3. Use two pointers (left, right) to find pairs such that:
               nums[i] + nums[left] + nums[right] = 0
        4. Skip duplicates carefully for:
               - the fixed index i
               - left pointer after finding a valid triplet

    Important:
        Duplicate handling must be done correctly,
        otherwise results may repeat or valid results may be skipped.

    // Time Complexity : O(n^2)
        Sorting: O(n log n)
        Outer loop + two-pointer scan: O(n^2)
    // Space Complexity : O(1)
        Ignoring output list.
"""

from typing import List

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()

        resList = []

        print(nums)
        i = 0
        while i< len(nums):
            target = 0 - nums[i]
            left = i+1
            right = len(nums) - 1
            while (left < right):
                if ((nums[left] + nums[right]) == target):
                    resList.append ([nums[i], nums[left], nums[right]])
                    left +=1
                    right-=1
                    while i+1 < len(nums) and nums[i+1] == nums[i]:
                        i+=1
                    while left < len(nums)-1 and nums[left-1] == nums[left]:
                        left+=1
                elif((nums[left] + nums[right]) > target):
                    right-=1
                elif((nums[left] + nums[right]) < target):
                    left+=1
            i+=1
        
        return resList
                





