class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        result = 0
        left = 0
        right = len(height) - 1
        while left < right:
            if height[left] < height[right]:
                result = max(result, (right - left) * height[left])
                left += 1
            else:
                result = max(result, (right - left) * height[right])
                right -= 1
        return result