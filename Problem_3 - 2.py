"""
Time Complexity : O(n)
Space Complexity : O(1)
    
"""

class Solution:
    def maxArea(self, height: List[int]) -> int:
        if len(height) == None or not height:
            return 0
        max_ = 0 
        l = 0 
        h = len(height) - 1 
        
        while l < h:
            max_ = max(max_, (h-l) * min(height[l],height[h]))
            if height[l] == height[h]:
                l += 1
                h -= 1
            elif height[l] < height[h]:
                l += 1
            else:
                h -= 1 
                
        return max_