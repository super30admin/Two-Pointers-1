"""
uses the two pointers technique to check which conditions will give us the maximun area
TC will be o(n) and SC will be o(1)"""


class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        l, r = 0, len(height) - 1
        res = 0

        while l < r:
            w = r - l
            currArea = w * min(height[l], height[r]) #width * l/r whatevers minimum
            res = max(res, currArea)
            
            if height[l] < height[r]: #to shift pointers inwards
                l += 1
            else:
                r -= 1
        return res