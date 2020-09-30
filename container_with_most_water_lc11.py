"""
Name: Srinidhi Bhat
Space complexity: O(1) - Only variables
Time Complexity: O(n) - Iterating through the array once

Did it run on LC: Yes

Logic:
1. Amount of water we can fill is - min of height of two pillar * breadth
breadth we cab get by subtracting the positions of the two pointers

2. Min height of two pillars- Keep two pointers - one in begining and one in
end
find the possible area with these two as pillars.

Which ever pointer had the lesser height, change that
"""
class Solution:
    def maxArea(self, height: List[int]) -> int:
        if not height:
            return []
        
        left, right = 0, len(height)-1
        area = float('-inf')
        while left < right:
            area =max(area, (min(height[left],height[right])*(right-left)))
            
            if height[left] < height[right]:
                left+=1
            
            else:
                right-=1
        return area