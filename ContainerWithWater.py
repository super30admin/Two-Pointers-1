# Time Complexity : It is O(logn) since we are dividing the list by half in each iteration.
# Space Complexity : It is O(1) so extra space.
# Did this code successfully run on Leetcode :
# Any problem you faced while coding this :

from typing import List

class Solution:
    def maxArea(self, height: List[int]) -> int:
        LP =0
        RP = len(height) -1
        area =0 
        while (LP<RP):
            leftHeight = height[LP]
            rightHeight = height[RP]
            area = max(area, (RP - LP)*min(leftHeight,rightHeight))
            if height[LP]<height[RP]:
                LP=LP+1
            else: # height[RP] < height[RP-1]:
                RP = RP -1
        return area

obj = Solution()
print(obj.maxArea([1,3,2,5,25,24,5]))
# print(obj.maxArea([3,6,1]))
# print(obj.maxArea([1,8,6,2,5,4,8,3,7]))
# print(obj.maxArea([1,1]))