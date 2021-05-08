"""
Intuition: Area of a rectangle = width * height
Here width is the difference in the index. and height is the minimun of 2 heights. 
We pick the minimum of 2 heights as otherwise water will overflow.

In 2 pointer approach, the width will always decrease. So we need to maximize of height.
Hence we alawys move the pointer where there is a probability of increasing the height.
#####################################################################
Time Complexity : O(N)  N = number of elements
Space Complexity : O(1) 
#####################################################################
"""
class Solution:
    def maxArea(self, heights: List[int]) -> int:
        
        maxArea = 0
        left = 0
        right = len(heights) - 1
        
        while left < right:
            
            area = min(heights[left], heights[right])* (right - left)
            maxArea = max(area, maxArea)
            
            if heights[left] < heights[right]:
                left += 1
            else:
                right -= 1
            
        return maxArea