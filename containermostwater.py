##Time Complexity : O(n)
##Space Complexity :O(1)
##Did this code successfully run on Leetcode : Yes

class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        result = 0
        l, r =0, len(height) - 1
        while l<r:
            area = (r-1) * min(height[l], height[r])
            result = max(result, area)
            if height[l] < height[r]:
                l += 1
            else:
                r -=1
        return result