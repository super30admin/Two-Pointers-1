# Problem3 (https://leetcode.com/problems/container-with-most-water/)

class Solution:
    def maxArea(self, height: List[int]) -> int:
        maximumArea = 0
        left = 0
        right = len(height) - 1
        while left < right:
            area = min(height[right], height[left]) * (right - left)
            maximumArea = max(area, maximumArea)
            if height[left] < height[right]:
                left += 1
            else:
                right -= 1
        return maximumArea

#Time complexity O(n)
#Space complexity O(1)