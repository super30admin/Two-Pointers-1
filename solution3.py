# time: O(n)
# space: O(1)

class Solution(object):
    def maxArea(self, height):
        left, right = 0, len(height) - 1
        area = 0
        while left < right:
            area = max((right - left) * min(height[left], height[right]), area)
            if height[left] < height[right]:
                left += 1
            else:
                right -= 1
        return area
            