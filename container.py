"""
TC: O(n) n number of heights
SP:O(1) : constant time
"""

class Solution:
    def maxArea(self, height: List[int]) -> int:
        l, r = 0, len(height)-1
        maxA = 0
        while l <r:
            A = (r-l)*(min(height[l], height[r]))
            maxA = max(A, maxA)
            if height[l]<height[r]:
                l+=1
            else:
                r-=1
        return maxA
