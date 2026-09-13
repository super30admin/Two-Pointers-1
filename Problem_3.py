#Time Complexity : O(n)
#Space Complexity : O(1)
#Did this code successfully run on Leetcode :Yes
class Solution:
    def maxArea(self, height: List[int]) -> int:
        left, right = 0, len(height) - 1
        max_area = 0

        while left < right:
            # Calculate current area
            curr_area = min(height[left], height[right]) * (right - left)
            max_area = max(max_area, curr_area)

            # Move the pointer pointing to smaller height
            if height[left] < height[right]:
                left += 1
            else:
                right -= 1

        return max_area
