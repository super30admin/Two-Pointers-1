# Leetcode 11 Container with most water
# Time - O(n)
# Space - O(1)

class Solution:
    def maxArea(self, height: List[int]) -> int:
        
        left = 0
        right = len(height) - 1
        
        water_volume = 0
        
        while(left < right):
            
            min_height = min(height[left], height[right])
            
            water_volume = max( water_volume , min_height * (right - left))
            
            if (height[left] > height[right]):
                
                right = right -1
            
            else:
                
                left = left + 1
        
        return water_volume
            
            
        
        