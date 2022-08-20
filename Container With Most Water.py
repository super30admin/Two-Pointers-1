# Time Complexity : O(n)
# Space Complexity :O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : None

class Solution:
    def maxArea(self, height: List[int]) -> int:
        
        left = 0
        right = len(height) - 1
        maxi = 0
        while left < right:
            area = min(height[left], height[right]) * (right - left)
            maxi = max(maxi, area)
            if height[left] > height[right]:
                right -= 1
            else:
                left += 1
        return maxi