"""
Time Complexity: O(n)
Space Complexity: O(1)
"""

class Solution:
    def maxArea(self, height: List[int]) -> int:
        hlen = len(height)
        l = 0
        r = hlen - 1
        maxvalue = 0

        while(l < r):
            currArea = (r-l) * min(height[l], height[r])
            maxvalue = max(maxvalue, currArea)

            if(height[l] < height[r]):
                l += 1
            else:
                r -= 1
        return maxvalue


        