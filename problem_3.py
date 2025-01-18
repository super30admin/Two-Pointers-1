"""
problem 3: Container With Most Water
TC: O(n)
SC: O(1)
Approach: Use two pointers to find the maximum area.
"""
from typing import List


class Solution:
    def maxArea(self, height: List[int]) -> int:
        n = len(height)
        l = 0
        r = n-1
        minheight= 0
        ans = 0
        while l<r:
            minheight = min(height[l],height[r])
            ans = max(ans, minheight* (r-l) )

            if minheight== height[l]:
                l+=1
            else:
                r-=1
        return ans