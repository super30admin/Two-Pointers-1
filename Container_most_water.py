#brute_force

# class Solution:
#     def maxArea(self, height: List[int]) -> int:
#         if len(height)==0:
#             return 0
#         i=0
#         max_area=0
#         for i in range (len(height)):
#             for j in range(i+1,len(height)):
#                 #constrained_height to find area is min of both the heights, and width is j-i
#                 max_area=max(max_area, min(height[i],height[j])*(j-i))
#         return max_area

#Optimal_solution
from typing import List


class Solution:
    def maxArea(self, height: List[int]) -> int:
        if len(height)==0:
            return 0
        left=0
        right=len(height)-1
        max_area=0
        while left<right:
            max_area=max(max_area, min(height[left],height[right])*(right-left))
            if height[left]<=height[right]:
                left+=1
            else:
                right-=1

        return max_area