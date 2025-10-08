# Time Complexity  : O(n)        # We scan the array once using two pointers
# Space Complexity : O(1)        # No extra space used, just variables for pointers and area
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this :
#   Initially, it feels like we might skip some container pairs by moving one pointer,
#   but moving the shorter line ensures we never miss the maximum possible area.

# ------------------------------
# Approach:
# ------------------------------
# Problem: Find two lines that together with the x-axis form a container holding the most water.
#
# Intuition:
# - The area of water contained = min(height[left], height[right]) * (right - left)
# - The width (right - left) is largest when the lines are far apart.
# - The height is limited by the shorter of the two lines.
#
# Two-pointer approach:
# 1. Start with two pointers — one at the start (low) and one at the end (high).
# 2. Calculate the area formed by these two lines.
# 3. Move the pointer pointing to the shorter line inward.
#    → Because moving the taller line will only reduce width
#      without increasing height.
# 4. Keep updating the maximum area found.
# 5. Stop when both pointers meet.
#
# This guarantees that no possible larger area is missed.

class Solution:
    def maxArea(self, height: List[int]) -> int:
        n = len(height)
        low, high = 0, n - 1     # Start pointers at both ends
        area = 0                 # Variable to store max area found so far 

        # Loop until the two pointers meet
        while low < high:
            # Width is the distance between two lines
            w = high - low

            # Height is limited by the shorter line
            h = 0
            if height[low] < height[high]:
                h = height[low]   # Use the shorter line
                low += 1          # Move the shorter line forward
            else:
                h = height[high]
                high -= 1         # Move the shorter line backward

            # Calculate current area and update max area
            area = max(area, h * w)

        # Return the maximum area found
        return area
