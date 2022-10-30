#Time Complexity - O(n)
#Space Complexity - O(1)
class Solution:
    def maxArea(self, height: List[int]) -> int:
        left = 0 
        right = len(height) - 1
        maxWater = 0
        
        while left < right:
            maxWater = max(maxWater, (right - left) * min(height[left], height[right]))
            if height[left] < height[right]:
                left += 1
            else:
                right -= 1
        
        return maxWater