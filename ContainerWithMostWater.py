# Time Complexity: O(N), N is the number of elements in height list
# Space Complexity: O(1)
# Did this code successfully run on Leetcode: Yes


from typing import List

class Solution:
    def maxArea(self, height: List[int]) -> int:
        max_area = 0

        # use two pointer approach
        left = 0
        right = len(height) - 1

        while left < right:
            area = min(height[left], height[right]) * (right - left)
            max_area = max(max_area, area)

            if height[left] == height[right]:
                left += 1
                right -= 1
            elif height[left] > height[right]:
                right -= 1
            else:
                left += 1
        
        return max_area