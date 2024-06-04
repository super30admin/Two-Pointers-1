# Time Complexity
# O(n)
# Space Complexity
# O(1)


# Approach :

# use 2 pointers left and right
# compute height as the minimum of both the heights
# check which height is smaller, incase the left index hegiht is smaller, increment left pointer
# if the right index height is smaller decrement the right pointer
# keep comparing the max area with the new area.

import sys


class Solution:
    def maxArea(self, height: List[int]) -> int:

        if not height:
            return []

        right = len(height)-1
        left = 0
        maxArea = -sys.maxsize-1

        while (left < right):

            h = min(height[left], height[right])
            w = right-left

            maxArea = max(h*w, maxArea)

            if (height[left] < height[right]):
                left = left+1
            else:
                right = right-1

        return maxArea
