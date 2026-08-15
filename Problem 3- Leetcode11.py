#Time complexity: O(n)
#Space complexity: O(1)

class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        n = len(height)
        l, r, m = 0, n - 1, 0

        while l < r:
            if height[l] < height[r]:
                m = max(m, height[l] * (r - l))
                l += 1
            else:
                m = max(m, height[r] * (r - l))
                r -= 1
                
        return m
        