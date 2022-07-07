# time complexity: O(n)
# space complexity: O(1)
# Approach:
# Two pointer technique.
# start left pointer from 0 and right from last index
# set initial product as 0 and update it whenever new product is greater than old product.
# update the  pointer with smaller value(height)
# if both are same, update both



class Solution:
    def maxArea(self, height: List[int]) -> int:
        maxprod = 0
        left = 0
        right = len(height)-1
        while left < right:
            maxprod = max(maxprod, min(height[left],height[right])*(right-left))
            if height[left]<height[right]:
                left = left+1
            elif height[right]<height[left]:
                right = right -1
            else:
                left = left+1
                right = right - 1
        return maxprod
                
        
        