"""
Time Complexity : O(n)
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No
"""
class Solution:
    def maxArea(self, height: List[int]) -> int:
        if len(height) == 0:
            return 0
        low = 0
        high = len(height) - 1
        area = 0
        # Traverse through list with two pointers high and low
        while low < high:
            # Calculating the width by taking the diff of high and low
            # and multiplying it with min between high and low
            # Max area out of previous and current
            area = max(area,  (high - low) * min(height[low], height[high]))
            # low is smaller so incrementing it
            if height[low] < height[high]:
                low += 1
            # high pointer is smaller so decrementing it
            else:
                high -= 1
        return area