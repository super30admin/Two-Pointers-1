"""
Implemented using the two-pointer approach, where two pointers — left and right — calculate the area in a single pass, store the maximum area, and move accordingly.
Time Complexity: O(n)
Space Complexity: O(1)
"""
class Solution:
    def maxArea(self, heights: List[int]) -> int:
        left, right = 0, len(heights) - 1
        ans = 0
        while left < right:
            height = min(heights[left], heights[right])
            ans = max(ans, height * (right - left))
            if heights[left] < heights[right]:
                left += 1
            else:
                right -= 1
        return ans