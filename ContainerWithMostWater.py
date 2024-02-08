'''
TC: O(n)
SC: O(1)
'''
from typing import List

class Solution:
    def maxArea(self, height: List[int]) -> int:
        i,j = 0, len(height)-1
        area = 0
        while i<j:
            area = max(area, min(height[i],height[j])*(j-i))
            if height[i] <= height[j]:
                i+=1
            else:
                j-=1
        return area
s = Solution()
print(s.maxArea([1,8,6,2,5,4,8,3,7]))
print(s.maxArea([1,1]))