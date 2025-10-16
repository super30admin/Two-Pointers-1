class Solution:
    def maxArea(self, height: List[int]) -> int:
        # Take 2 pointers at opposite ends. 
        # Area is calculated with width and height.
        # When we are at opposite ends width is maximum.
        left = 0
        right = len(height) - 1
        maxArea = float('-inf')
        while left < right:
            area = min(height[left], height[right]) * (right - left)
            maxArea = max(maxArea, area)
            if(height[left] > height[right]):
                right = right - 1
            else:
                left = left + 1
        return maxArea
            