## Problem3 (https://leetcode.com/problems/container-with-most-water/)

#Time Complexity : O(n)
# Space Complexity : O(1) 
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Aprroach: Traverse through the array, with two pointers high and low, and keep track of
# max area.

class Solution:
    def maxArea(self, height: List[int]) -> int:
        low=0
        high=len(height)-1
        max_water=0
        while low< high:
            area=min(height[low],height[high])* (high-low)
            if area>max_water:
                max_water=area
            if height[low]>height[high]:
                high-=1
            else:
                low+=1
        return max_water
                
        