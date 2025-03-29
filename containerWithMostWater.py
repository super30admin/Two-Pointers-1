# Time Complexity: O(n) where n is the length of the input array
# Space Complexity: O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Approach:
# 1. We take the two-pointers approach here.
# 2. We will start with the longest possible width by having the low pointer at 0 and high pointer at length-1
# 3. We find the largest possible area for the shorter of the two rods, and compare it with the current maximum area, updating it.
# 4. Now that we have found the largest possible area for the shorter rod, we move away from it and try to find a longer rod, as that is the only way to maximize the area as the width keeps decreasing.
from typing import List
class Solution:
    def maxArea(self, height: List[int]) -> int:
        # Initialize the low and high pointers
        low, high = 0, len(height)-1
        area = 0
        # Iterate over the array while low and high pointers have not crossed
        while low < high:
            # Calculate the current area
            curArea = min(height[low], height[high]) * (high-low)
            # Update the maximum area
            area = max(area, curArea)
            # Move the pointer pointing to the shorter rod
            if height[low] <= height[high]:
                low += 1
            else:
                high -= 1
        # Finally, return area
        return area