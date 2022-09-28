# // Time Complexity : O(n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this :
from typing import List
def maxArea(height: List[int]) -> int:
    l, r = 0, (len(height) - 1)
    maxArea = 0
    while l < r:
        minHeight = min(height[l], height[r])
        currentArea = minHeight * (r-l)
        maxArea = max(currentArea, maxArea)
        
        if height[l] < height[r]:
            l += 1
        else:
            r -= 1
            
    return maxArea


height = [1,8,6,2,5,4,8,3,7]

print(maxArea(height))