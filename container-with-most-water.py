# Time Complexity: O(n)
# Space Complexity: O(1)
class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        left = 0
        right = len(height)-1
        max_water = height[right] * abs(left-right) if height[left] > height[right] else height[left] * abs(right-left)
        while left < right:
            if height[left] < height[right]:
                left += 1
            else:
                right -= 1
            max_water = max(max_water, height[right] * abs(right-left) if height[left] > height[right] else height[left] * abs(left-right))
        return max_water