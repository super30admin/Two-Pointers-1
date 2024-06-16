# Time Complexity :
# O(n) 

# Space Complexity :  
# O(1) 


# Approach:
# Two pointer approach. Initialize maxArea to smallest number
# ==> Calculate currentArea between bars at left and right.
# ==> Update the "maxArea" based on whether currArea is larger than previous value of "maxArea"
# ==> Advance left and right pointers based on which bar is smaller,
#    i.e if left basr is smaller, advance the left pointer, else advance right pointer.


import math
class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        if not height or len(height) == 0:
            return 0
        
        maxArea = -10000

        left = 0
        right = len(height)-1

        while (left<right):
            # calculate area between current bars
            currArea = min(height[left], height[right]) * (right-left)
    
            # update maxArea
            maxArea = max(maxArea, currArea)

            # advance left pointer to right if bar at left was small
            if height[left] < height[right]:
                left += 1

            # advance right pointer to left if bar at right was small
            else:
                right -= 1

        return maxArea