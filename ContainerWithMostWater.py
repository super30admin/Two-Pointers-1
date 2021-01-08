# Time Complexity : O(N)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Your code here along with comments explaining your approach
# Using two pointers left and right to calculate the area and distance.
# Increment the left if left < right else decrement the right pointer


class Solution:
    def maxArea(self, height: List[int]) -> int:
        if len(height) == 0:
            return 0

        left = 0
        right = len(height) - 1
        maxarea = 0
        while left < right:

            area = min(height[left], height[right])
            distance = right - left
            maxarea = max(maxarea, area * distance)
            if height[left] < height[right]:
                left += 1
            else:
                right -= 1
        return maxarea
