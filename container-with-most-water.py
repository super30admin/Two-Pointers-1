# Approach:
# Use the two-pointer technique, starting at both ends and moving the pointer pointing to the shorter height inward to maximize the area.
# Calculate the area at each step using min(height[i], height[j]) * (j - i), updating the maximum area found.
# Time Complexity: O(n)
# Space Complexity: O(1)
class Solution:
    def maxArea(self, height: List[int]) -> int:
        i = area = 0
        j = len(height) - 1
        while i < j:
            width = j - i
            area = max(area,min(height[i], height[j])*width)
            if height[i] < height[j]:
                i += 1
            else: 
                j -= 1

        return area
