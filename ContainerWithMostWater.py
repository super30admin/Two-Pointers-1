class Solution:
    def maxArea(self, height: list[int]) -> int:
        if(height == None or len(height) < 2):
            return 0
        
        left = 0
        right = len(height) - 1
        maxArea = 0
        while (left < right):
            currHeight = min(height[left], height[right])
            width = right - left
            maxArea = max(maxArea, currHeight * width)
            if(height[left] < height[right]):
                left += 1
            else:
                right -= 1

        return maxArea
        
        
        