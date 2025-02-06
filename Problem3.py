# Problem 3 - Container With Most Water
# Time Complexity : O(n)
# Space Complexity : O(1)
#  Did this code successfully run on Leetcode : Yes
#  Any problem you faced while coding this :
'''
While solving this problem, the challenge I faced was determining how to move the pointers. If the movement wasn't decided 
correctly, the optimal solution wouldn't be reached. Additionally, handling the edge case where the heights pointed to by the 
two pointers were the same was another issue.
'''

# Your code here along with comments explaining your approach
from typing import List

class Solution:
    def maxArea(self, height: List[int]) -> int:
        # Storing the maximum area
        area = 0
        # Two pointer- left pointer will be at left position and right pointer at right most position
        l = 0 
        r = len(height) - 1
        # Run the loop until left pointer crosses the right pointer
        while (l < r):
            # Calcula the current area by selecting the minimum height and width
            currArea = min(height[l], height[r]) * (r-l)
            # Store the maximum area between area and current area
            area = max(area, currArea)
            # if the height at left pointer is less than the height at right pointer then increment the lef pointer
            if (height[l]< height[r]):
                l += 1
            # else devrement the right pointer
            else:
                r -= 1
        return area
        