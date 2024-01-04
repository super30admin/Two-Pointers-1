# Time Complexity: O(n)
# Space Complexity: O(1)
class Solution:
    def maxArea(self, height: list[int]) -> int:
        if height is None or len(height) == 0:
            return 0
        
        left = 0
        right = len(height) - 1
        max_area = 0

        while left < right:
            max_area = max(max_area, min(height[left], height[right]) * (right - left))

            if height[left] < height[right]:
                left += 1
            else:
                right -= 1

        return max_area
