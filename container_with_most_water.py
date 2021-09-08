# // Time Complexity : O(n) where n is the number of elements
# // Space Complexity : O(1) where n is the number of rows
# // Did this code successfully run on Leetcode : yes
# // Any problem you faced while coding this : none

# // Your code here along with comments explaining your approach
class Solution:
    def maxArea(self, height: List[int]) -> int:
        right = len(height)-1
        left = 0
        maxArea = 0
        while right > left:
            maxArea = max(maxArea,min(height[right],height[left])*(right-left))
            if height[left] < height[right]:
                left += 1
            else:
                right -= 1
        return maxArea
        