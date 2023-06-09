"""
Problem : 3

Time Complexity : O(n)
Space Complexity : O(1)

Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No

Using two pointer approach, incrementing or decrementing 
the index having lesser height among the left and right pointer
returning the maximum area at the end
"""

# Container with most water

class Solution(object):
    def maxArea(self, height):
        maxArea=0
        l,r=0,len(height)-1


        while l<=r:
            area=min(height[r],height[l])*(r-l)
            maxArea=max(maxArea,area)
            if height[r]>height[l]:
                l+=1
            else:
                r-=1
        return maxArea