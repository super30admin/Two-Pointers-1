class Solution:
    def maxArea(self, height: List[int]) -> int:
        if height == 0 or len(height) == 0:
            return 0
        n = len(height)
        Max = 0
        left = 0
        right = n - 1
        while left < right:
            Max = max(Max, (min(height[left], height[right]) * (right - left)) )
            if height[left] < height[right]:
                left = left + 1
            else:
                right = right - 1
        return Max

  
        