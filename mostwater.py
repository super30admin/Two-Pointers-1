# Time Complexity : O(N)
# Space Complexity : O(1)  
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach:
# I initialize two pointers, one at the beginning and one at the end of the height array
# I then calculate the area formed between the two pointers and update the maximum area if the current area is larger.
# I move the pointer with the smaller height inward, as this could potentially lead to a larger area.
# I repeat this process until the two pointers meet.

from typing import List
class Solution:
    def maxArea(self, height: List[int]) -> int:
        maxarea = 0
        left = 0
        right = len(height) - 1

        while left < right:
            width = right - left
            maxarea = max(maxarea, min(height[left], height[right]) * width)
            if height[left] <= height[right]:
                left += 1
            else:
                right -= 1

        return maxarea

        