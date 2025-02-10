# 11. Container With Most Water

# Time Complexity: O(n)
# Space Complexity: O(1)

# Approach:
# Use two pointers to find the maximum area. Move the pointer with the smaller height inward.

class Solution:
    def maxArea(self, height: List[int]) -> int:
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