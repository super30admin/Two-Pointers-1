# Time Complexity : Add - O(n)
# Space Complexity :O(1)
# Did this code successfully run on Leetcode : Yes.

# Any problem you faced while coding this : No

'''
1. For a given area, fixing low and high and them moving the pointer toward each would decrease width
2. So to increase Area we need to find max height, so we increase our poniter away from the lower height, and globally calculate max area

'''

class Solution:
    def maxArea(self, height: List[int]) -> int:
        
        if height == [] or len(height) < 1:
            return 0
        
        max_area = 0        
        low = 0
        high = len(height)-1
        
        while (low < high):
            
            area = (high - low) * min(height[low], height[high])
            max_area = max(max_area, area)
            
            if (low <  high) and height[low] <= height[high]:
                low += 1
            elif (low <  high) and height[low] > height[high]:
                high -= 1
                
        return max_area
            
            
        