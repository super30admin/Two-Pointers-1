# Time Complexity : O(n)
# Space Complexity : O(1)
from typing import List


class Solution:
    def maxArea(self, height: List[int]) -> int:
        if height == 0 or len(height) < 2:
            return 0
        max1 = 0
        left = 0
        n = len(height)
        right = n -1 
        while left <= right:
            max1 = max(max1, min(height[left], height[right])* (right - left))
            if height[left] < height[right]:
                left = left +1
            else:
                right = right -1 
        return max1