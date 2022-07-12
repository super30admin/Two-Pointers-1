# Time Complexity: O(n)
# Space Complexity: O(1)

class Solution:
    def maxArea(height):
        if height is None or len(height) == 0:
            return 0
        
        left = 0
        right = 0
        maxArea = 0

        while left <= right:
            maxArea = max(maxArea, min(height[left], height[right]) * (right - left))
            if height[left] < height[right]:
                left += 1
            else:
                right -= 1
        
        return maxArea