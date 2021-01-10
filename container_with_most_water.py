# -*- coding: utf-8 -*-
"""
TC: O(N) where Nis the number of elements in the array
SC : O(1) as no extra space used
"""


class Solution:
    def maxArea(self, height:[]) -> int:
        #edge case
        if not height or len(height) == 0:
            return -1
        
        l = 0
        h = len(height) -1
        max_area = 0 #area of the container
        
        #traverse through the height array
        while l <= h:
            #calculate max_area to compare it with other areas in the array
            #area = minimu(height) * width
            #since we are sqeezing the width smaller, we need to find a taller height to have an area
            #larger than our current one
            #we take the min of two heights to construct a container and * with current width
            #We compare this area with other max areas
            max_area = max(max_area, min(height[l],height[h]) * (h-l))
                  
            if height[l] <= height[h]: #to know which pointer to move towards left or right
                l += 1 #move towards right
            else:
                h -= 1 #move towards left
        
        return max_area #return area
    
S= Solution()
height = [1,8,6,2,5,4,8,3,7]
print(S.maxArea(height))