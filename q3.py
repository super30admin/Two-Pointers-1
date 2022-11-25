from typing import List
import sys
# Time Complexity : O(n), Where n is number of elements in the height List
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : Nothing specific

class Solution:
    def maxArea(self, height: List[int]) -> int:
        n=len(height)
        output= -sys.maxsize - 1
        i,j=0,n-1
        while(i<=j):
            area=(min(height[i],height[j])*(j-i))
            if(area>output):
                output=area
            #Check the values of both heights
            if(height[i]>height[j]):
                #Here minimum height is at "j"
                j-=1
            else:
                #Here minimum height is at "i"
                i+=1
        return output
        