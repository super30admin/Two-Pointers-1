#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Sun Feb 22 14:03:32 2026

@author: rishigoswamy

    LeetCode 11: Container With Most Water
    Link: https://leetcode.com/problems/container-with-most-water/

    Approach:
    Two Pointers.

    Start with the widest container (left=0, right=n-1).
    Area = min(height[left], height[right]) * (right - left)

    To potentially find a larger area, we must increase the limiting height.
    Therefore:
        - If height[left] < height[right], move left pointer rightward.
        - Else, move right pointer leftward.

    This works because moving the taller pointer cannot increase the min height
    (the shorter one is still the bottleneck), but it will definitely decrease width.

    // Time Complexity : O(n)
        Each pointer moves at most n times.
    // Space Complexity : O(1)
        Constant extra space.
"""

from typing import List

class Solution:
    def maxArea(self, height: List[int]) -> int:
        maxarea = float('-inf')

        l = 0
        r = len(height)-1

        while l<=r:
            maxarea = max(min(height[l], height[r]) * (r-l), maxarea)

            if height[l]<height[r]:
                l+=1
            else:
                r-=1
        
        return maxarea
        
