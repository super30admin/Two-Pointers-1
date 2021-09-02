#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Wed Sep  1 22:40:41 2021

@author: ameeshas11
"""
#Time Complexity : O(n^2)
#Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
#Any problem you faced while coding this : No

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        out = set()
        
        if len(nums)<3:
            return out
        nums.sort()
        for i in range(len(nums)-2):
            if (i>0 and nums[i] == nums[i-1]):
                continue
            low = i+1
            high = len(nums)-1
            while(low<high):
                sumval = nums[i] + nums[low] + nums[high]
                if (sumval == 0):
                    out.add((nums[i], nums[low], nums[high]))
                    low +=1
                    high-=1
                elif sumval>0:
                    high -=1
                else:
                    low += 1
        

        return out
        