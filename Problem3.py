# Time Complexity: O(N)
# Space complexity: O(1)
# Leetcode all test cases passed: Yes
# Any difficulties: No

class Solution:
    def maxArea(self, height: List[int]) -> int:
        left = 0
        right = len(height) - 1
        area = 0
        max_area = 0
        while left < right:
            if height[left] < height[right]:
                area = height[left] * (right-left)
                left += 1
            else:
                area = height[right] * (right-left)
                right -= 1
            max_area = max(area, max_area)
        return max_area
