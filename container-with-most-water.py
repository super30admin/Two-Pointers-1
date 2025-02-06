# Time Complexity : O(n) - n is length of height
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no

"""
use two pointers, l from 0 , r from n-1
calculate the area between l and r and take max(maxAreaSoFar, current area)
if height[l] < height[r], l += 1
else, r -= 1

"""

class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        n = len(height)
        l = 0
        r = n-1
        maxArea = 0

        while l < r:
            maxArea = max(maxArea, min(height[l],height[r])*(r-l))
            if height[l] <= height[r]:
                l += 1
            else:
                r -= 1

        return maxArea