"""
Time Complexity : O(n^2)
Space Complexity : O(1)
    
"""

class Solution:
    def maxArea(self, height: List[int]) -> int:
        if len(height) == None or not height:
            return 0
        max_ = 0 
        
        for i in range(len(height)-1):
            for j in range(i+1,len(height)):
                max_ = max(max_, (j-i) * min(height[i],height[j]))
                
        return max_
                