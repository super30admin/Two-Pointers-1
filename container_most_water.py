"""
TC -> O(n)
SC -> O(1)
Logic
use 2 pointer.
compute area. Area is restricted by the container with smaller height.
So area = min(heights[l],heights[r])*(r-l). Update the max_area if this area is greater.
How to move the pointer?
If height[l]>heights[r], it means moving l wont do good. So we move the smaller height which is r
Otherwise we move the l pointer.
Crux is move the pointer that points to the smaller height. If both the heights are equal, just move any.
"""
class Solution:
    def maxArea(self, height: List[int]) -> int:
        left = 0
        right = len(height)-1
        max_area = 0

        while(left<right):
            length = right - left
            width = min(height[left], height[right])
            max_area = max(max_area, length*width)
            if(height[left]<height[right]):
                left+=1
            else:
                right-=1
        return max_area