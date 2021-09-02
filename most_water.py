#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Wed Sep  1 22:41:26 2021

@author: ameeshas11
"""
#Time Complexity : O(n)
#Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
#Any problem you faced while coding this : No

class Solution:
    def maxArea(self, height: List[int]) -> int:
        
        low = 0
        high = len(height) - 1
        maxval = -1
        while (low < high):
            area = min(height[low], height[high])*(high-low)
            maxval = max(maxval, area)
            if height[low]<=height[high]:
                low += 1
            else:
                high -= 1
                
        return maxval