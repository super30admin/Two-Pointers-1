#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Wed Dec  4 09:04:26 2019

@author: tanvirkaur
"""
#time complexity = O(n + nlogn)
# space complexity = O(1)
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        res = []
        for a in range(len(nums)-2):
            if a > 0 and nums[a] == nums[a-1]:
                continue
            b = a+1
            c = len(nums)-1
            target = -nums[a]
            while b< c:
                if nums[b] + nums[c] == target:
                    res.append((nums[a],nums[b],nums[c]))
                    b += 1
                    c -= 1
                    while(b < c and nums[b] == nums[b-1]):
                        b += 1
                    while(b < c and nums[c] == nums[c+1]):
                        c -= 1
                else:
                    if nums[b] + nums[c] > target:
                        c -= 1
                    else:
                        b += 1
        return res