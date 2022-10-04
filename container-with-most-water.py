# Time complexity: O(n)
# Space complexity: O(1)

# The code successfully ran on leetcode

class Solution:
    def maxArea(self, height: List[int]) -> int:
        n = len(height)
        if n == 0 or height == None:
            return 0
        
        maximum = -math.inf
        low = 0
        high = n - 1
        
        while low < high:
            area = (high - low) * min(height[high], height[low])
            
            if area > maximum:
                maximum = area
                
            if height[low] < height[high]: low += 1
            else: high -= 1
            
        return maximum