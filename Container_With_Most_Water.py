# Time Complexity : O(N)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def maxArea(self, height: List[int]) -> int:
        # Two pointer
        left = 0
        right = len(height) - 1
        area = 0
       
        while left < right:
            # calculate area and why min in height since max the water will overflow so.
            area = max(area, min(height[left], height[right]) * (right - left))
            
            
            if height[left] < height[right]:
                left += 1
            else:
                right -= 1
                
        return area
