"""
Approach: use two pointers l and r and move the pointer with lower height-> greedily rejecting the smaller height.
t.c.=> O(n)
s.c. => O(1)
"""
class Solution:
    def maxArea(self, height: List[int]) -> int:
        l, r = 0, len(height) - 1
        maxWater = 0
        while l < r:
            water = r - l
            if height[l] < height[r]:
                water *= height[l]
                l += 1
            else:
                water *= height[r]
                r -= 1
            maxWater = max(maxWater, water)
        return maxWater
        