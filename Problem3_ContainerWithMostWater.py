# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes

# Solution:
"""
1. To find the maximum area, consider 2 pointers - from start and from end.
2. Find the area by multiplying the minimum height of the 2 pointers and the width between the 2 pointers.
3. Update the maximum area and repeat this until the start pointer meets the end pointer.
"""

def maxArea(self, height: List[int]) -> int:
    if not height or len(height) <= 1:
        return 0

    max_area = 0
    i = 0
    j = len(height) - 1

    while i < j:

        # Area = height * width and it is constrained by the min height
        area = min(height[i], height[j]) * (j - i)
        max_area = max(max_area, area)

        # Move the lower height pointer to get a better height and maximize the area
        if height[i] <= height[j]:
            i += 1
        else:
            j -= 1

    return max_area




