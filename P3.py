# -*- coding: utf-8 -*-
"""
Created on Mon Apr 12 11:38:15 2021

@author: jgdch
"""

#time Complexity:O(N), N is length of input
#Space complexity: O(1)
#Passed all leetcode testcases
class Solution:
    def maxArea(self, height: List[int]) -> int:
        l=0
        r=len(height)-1
        area=0
        while(l<r):
            area=max(area,min(height[l],height[r])*(r-l))
            if(height[l]<=height[r]):
                l+=1
            else:
                r-=1
        return area
            