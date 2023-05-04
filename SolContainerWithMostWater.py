"""
s30 - single pass solution. TC = O(N) , SC = O(1)
"""

class Solution:
    def maxArea(self, height: List[int]) -> int:
        maxAreaSofar = 0
        start = 0
        end = len(height)-1
        while end > start:
            currArea = min(height[end] , height[start]) * (end - start)
            maxAreaSofar = max(currArea, maxAreaSofar)
            if height[end] < height[start]:
                end -= 1
            else:
                start += 1
        return maxAreaSofar