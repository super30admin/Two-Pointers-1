# Two-pointer: Move the pointer with the smaller height to maximize area
# TC: O(N) - We traverse the list once with two pointers
# SC: O(1) - Constant extra space used
from typing import List


class Solution:

    def maxArea(self, heights: List[int]) -> int:
        if len(heights) < 2:
            return 0  # Handle edge case

        left, right = 0, len(heights) - 1
        max_area = 0

        while left < right:  # Should be left < right instead of left <= right
            curr_area = min(heights[left], heights[right]) * (right - left)
            max_area = max(curr_area, max_area)

            if heights[left] < heights[right]:
                left += 1
            else:
                right -= 1

        return max_area


# Example usage
heights = [1, 8, 6, 2, 5, 4, 8, 3, 7]
sol = Solution()
print(sol.maxArea(heights))  # Output: 49
