"""
time - o(n)
space - o(1)
we use two pointers that start at the ends, we calculate the area by multiplying distance between two pointers and least height among
the two. We take a greedy approach by moving the smaller of the two heights
"""

from typing import List


class Solution:
    def maxArea(self, height: List[int]) -> int:
        left = 0
        right = len(height) - 1
        maxArea = float("-inf")
        while left < right:
            maxArea = max(maxArea, min(height[left], height[right]) * (right - left))
            if height[left] <= height[right]:
                left += 1
            else:
                right -= 1
        return maxArea
