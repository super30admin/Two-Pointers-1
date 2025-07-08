# Time Complexity: O(n)
# Space Complexity:O(1)

class Solution:
    def maxArea(self, height: List[int]) -> int:
        if len(height) <= 1:
            return 0
        left = 0
        right = len(height) - 1
        maxarea = 0
        while left < right:
            h = 0
            w = right - left
            maxarea = max(maxarea, h * w)
            if height[left] < height[right]:
                h = height[left]
                left += 1
            else:
                h = height[right]
                right -= 1
            maxarea = max(maxarea, h * w)

        return maxarea




