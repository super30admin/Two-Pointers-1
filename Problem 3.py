# Space: O(1)
# Time: O(n)
class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        mx = -1
        i = 0
        j = len(height) - 1
        while i < j:
            mx = max(mx, min(height[i], height[j]) * (j-i))
            if height[i] <= height[j]:
                i += 1
            else:
                j -= 1
        return mx
        
