"""
TC:O(n)
SC:O(1)
"""

class Solution:
    def maxArea(self, height: List[int]) -> int:
        l, r, max_area  = 0, len(height)-1, 0
        while l<r:
            base = r-l
            if height[r] >= height[l]:
                h = height[l]
                l+=1
            else:
                h = height[r]
                r-=1
            if h * base > max_area:
                max_area = h * base
        return max_area