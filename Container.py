#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Wed Dec  4 09:01:10 2019

@author: tanvirkaur
"""

# solved using two pointer
# Time complexity = O(n)
# Space complexity = O(1)
class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        left = 0
        right = len(height)-1
        max_area = 0
        while(left <= right):
            max_area = max(max_area, min(height[left],height[right])*(right-left))
            print(max_area)
            if height[left] < height[right]:
                left += 1
            else:
                right -= 1
        return max_area
        