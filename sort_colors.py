#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Wed Sep  1 22:39:48 2021

@author: ameeshas11
"""
#Time Complexity : O(n)
#Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
#Any problem you faced while coding this : No

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        low = mid = 0
        high = len(nums) - 1
        
        while mid<=high:
            if nums[mid] == 2:
                nums[mid], nums[high] =  nums[high], nums[mid]
                high -= 1
            elif nums[mid] == 0:
                nums[mid], nums[low] =  nums[low], nums[mid]
                low += 1
                mid += 1
            else:
                mid += 1