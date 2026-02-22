#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Sun Feb 22 13:54:45 2026

@author: rishigoswamy

    LeetCode 75: Sort Colors
    Link: https://leetcode.com/problems/sort-colors/

    Approach:
    Dutch National Flag Algorithm (Three Pointers).

    Maintain three regions:
        [0 ... p0-1]        -> all 0s
        [p0 ... curr-1]     -> all 1s
        [curr ... p2]       -> unknown
        [p2+1 ... end]      -> all 2s

    Rules:
        If nums[curr] == 0:
            swap with p0, move both p0 and curr forward
        If nums[curr] == 2:
            swap with p2, move p2 backward
            (do NOT move curr because swapped element needs evaluation)
        If nums[curr] == 1:
            just move curr forward

    // Time Complexity : O(n)
        Each element is processed at most once.
    // Space Complexity : O(1)
        In-place sorting.
"""

from typing import List

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        p0 = 0
        p2 = len(nums)-1
        curr = 0

        while curr <= p2:
            if nums[curr] == 0:
                nums[curr], nums[p0] = nums[p0], nums[curr]
                p0+=1
                curr+=1
            elif nums[curr] == 2:
                nums[curr], nums[p2] = nums[p2], nums[curr]
                p2-=1
            else:
                curr+=1
        

