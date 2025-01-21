# Time complexity - O(n)
# Space complexity - O(1)

# Approach - Maintain two pointers, increase left pointer when h[l] < h[r]
# or increase right pointer.

from typing import List
class Solution:
    def maxArea(self, height: List[int]) -> int:
        l = 0
        r = len(height) - 1
        maxA = 0

        while l < r:
            w = r - l
            h = min(height[l], height[r])
            maxA = max(maxA, h*w)
            if height[l] <= height[r]:
                l += 1
            else:
                r -= 1

        return maxA