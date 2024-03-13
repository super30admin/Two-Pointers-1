# https://leetcode.com/problems/container-with-most-water/

# Time Complexity : O(N) is number of elements in the array.
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : None

# Your code here along with comments explaining your approach.
# Approach - We have to keep two pointers from left and right and keep calculating area between them and update max-area
# We increment left pointer if height of left side is less than right side otherwise we decrement right pointer


from typing import List


class Solution:
    def maxArea(self, height: List[int]) -> int:
        max_area = 0
        left, right = 0, len(height) - 1
        while left < right:
            cur_area = min(height[left], height[right]) * (right - left)
            max_area = max(cur_area, max_area)
            if height[left] < height[right]:
                left += 1
            else:
                right -= 1
        return max_area
