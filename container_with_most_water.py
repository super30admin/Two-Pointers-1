# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach
from typing import List
class Solution:
    def maxArea(self, height: List[int]) -> int:
        maxVal = 0
        n = len(height)
        l = 0
        r = n-1
        while(l<r):
            currArea = min(height[l], height[r])*(r-l)
            maxVal = max(maxVal, currArea)
            if(height[l]<height[r]):
                l+=1
            else:
                r-=1
        return maxVal
    
sc = Solution()
height = [1,8,6,2,5,4,8,3,7]
print(sc.maxArea(height))
        