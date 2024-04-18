## Problem3 (https://leetcode.com/problems/container-with-most-water/)


# 2 Pointer Approach
# set the low & high pointer at the start and end of the arr respectively
# move the pointer with min height and at each step calculate the area
# compare area with the max area and return max_area

#Time Complexity: O(n)
# Space Complexity: O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def maxArea(self, height: List[int]) -> int:

        low = 0
        high = len(height)-1
        res = 0
        while(low<high):
            curArea = 0
            w = high-low
            h = min(height[low],height[high])
            curArea = w*h
            res = max(res,curArea)

            if height[low] < height[high]:
                low += 1
            else:
                high -= 1
        return res