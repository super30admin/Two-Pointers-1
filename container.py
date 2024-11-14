# The code defines a maxArea method to find the maximum area of water that can be contained by any two lines in a list of heights.
# The approach uses a two-pointer technique to efficiently find the largest container.

# Initialization:
#   - Set two pointers, 'l' at the beginning of the list and 'r' at the end, representing the two lines being considered.
#   - Initialize 'res' to 0, which will store the maximum area found.

# Main Loop:
#   - While the left pointer 'l' is less than the right pointer 'r':
#       - Calculate the area between the lines at l and r using the formula:
#           - area = min(heights[l], heights[r]) * (r - l), where the height of the container is the shorter of the two lines.
#       - Update 'res' to be the maximum of its current value and the calculated area.
#       - Move the pointers to potentially increase the area:
#           - If heights[l] is less than or equal to heights[r], increment 'l' to consider a taller line on the left.
#           - Otherwise, decrement 'r' to consider a taller line on the right.
#   
# Final Result:
#   - After the loop, 'res' contains the maximum area that can be achieved, which is returned.

# TC: O(n) - Each element in the list is considered once as the pointers move inward.
# SC: O(1) - The space complexity is constant as only a few variables are used.


from typing import List


class Solution:
    def maxArea(self, heights: List[int]) -> int:
        l, r = 0, len(heights) - 1
        res = 0

        while l < r:
            area = min(heights[l], heights[r]) * (r - l)
            res = max(res, area)
            if heights[l] <= heights[r]:
                l += 1
            else:
                r -= 1
        return res