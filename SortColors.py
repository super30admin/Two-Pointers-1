#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Wed Dec  4 09:00:33 2019

@author: tanvirkaur
"""

# using three pointer approach
# time complexity = O(n)
# space complexity = O(1)
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        low = 0
        mid = 0
        high = len(nums)-1
        while mid <= high:
            if nums[mid] == 2:
                self.swap(nums,mid,high)
                high -= 1
            elif nums[mid] == 0:
                self.swap(nums,mid,low)
                low += 1
                mid += 1
            else:
                mid += 1
        return nums
            
    def swap(self,nums,i, j):
        tmp = nums[i]
        nums[i] = nums[j]
        nums[j] = tmp