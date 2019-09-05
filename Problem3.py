  
# Time Complexity : O(n) 
# Space Complexity : O(1) 
# Did this code successfully run on Leetcode : Yes
# Three line explanation of solution in plain english:
# - Start with left as first element and right as last element. Assign 0 to max_water variable.
# - Calculate the water with left and right and compare with max_water to udate it.
# - Shrink from left if left element is less than right element else shrink from right side. Every time calculate water, compare with max water and update it.
class Solution:
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
#       Initialize left right and result
        left = 0
        result = 0
        if not height: return 0
        right = len(height)-1  
#       Run loop till left and right does not overlap
        while left != right:
#           Calculate the water with current left and right and compare it with global max water (result here)
            result = max(result, min(height[left], height[right])*(right-left))
#           If left element is less than right element than increase left element by 1 else decrease right element by 1. We are shrinking element with lower height.
            if height[left] < height[right]:
                left += 1
            else:
                right -= 1                
        return result
                
