# Time Complexity: O(n) where n is the number of elements in array
# Space Complexity: O(1)
# Ran on Leetcode: Yes

class Solution:
    def maxArea(self, height: List[int]) -> int:
        m = 0
        l = 0
        h = len(height) - 1
        while l <= h:
            m = max(m, min(height[l], height[h]) * (h - l))
            if height[l] <= height[h]:
                l += 1
            else:
                h -= 1
        return m
        