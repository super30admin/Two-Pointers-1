# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this :
  
  
"""
create 2 pointers low and high. as we move towards center, width is going to decrease, so we can try to maximize the height. In order to do so we will move 
the pointer with small height. iterate through all towers and get max.

"""


class Solution:
    def maxArea(self, height: List[int]) -> int:

        left = 0
        right = len(height) - 1
        Max = 0

        while left < right:
            Max = max(Max,min(height[left],height[right])*(right-left))

            if height[left] > height[right]:
                right -= 1
            else:
                left += 1

        return Max
