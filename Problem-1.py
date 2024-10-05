# Approach
# We need to Maximize the area of containers since height is not variable width is variable, we will start our 2 points at 0, n-1 poistions
# if low block is less than the high block move low to right else high to left

# Complexities
# Time Complexity: O(N)
# Space Complexity: O(1)




from typing import List




class Solution:
    def maxArea(self, height: List[int]) -> int:
        low = 0
        high = len(height) - 1

        area = float("-inf")

        while low < high:
            computed = (high - low) * min(height[low], height[high])
            area = max(area, computed)

            if height[low] > height[high]:
                high -= 1
            elif height[low] < height[high]:
                low += 1
            else:
                high -= 1
                low += 1
        return area
