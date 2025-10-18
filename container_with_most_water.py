# Approach (Greedy Two-Pointer):
# Use two pointers (one at each end) and greedily move the pointer at the shorter line inward.
# This is because the height of the water is limited by the shorter line, and moving it may lead to a taller line and a larger area.

# Time Complexity: O(n) — each pointer moves across the array at most once
# Space Complexity: O(1) — only a few variables are used

class Solution:
    def maxArea(self, height: List[int]) -> int:
        # Initialize two pointers — one at the start, one at the end of the array
        left = 0
        right = len(height) - 1
        
        # Variable to keep track of the maximum area found so far
        maxArea = float('-inf')
        
        # Keep moving the pointers toward each other until they meet
        while left < right:
            # Calculate the area formed by the lines at the left and right pointers
            area = self.getArea(left, right, height)
            
            # Update maxArea if we found a larger area
            maxArea = max(maxArea, area)
            
            # Move the pointer at the shorter line inward
            # because the height of the container is limited by the shorter line.
            # Moving the taller line won’t help — the height won't increase,
            # but the width will decrease.
            if height[left] < height[right]:
                left += 1
            else:
                right -= 1
        
        # Return the maximum area found
        return maxArea

    def getArea(self, leftIndex: int, rightIndex: int, height: List[int]) -> int:
        # Area = width * height
        # Width is the distance between two lines (rightIndex - leftIndex)
        # Height is the smaller of the two line heights (since water can't go above the shorter line)
        return (rightIndex - leftIndex) * min(height[leftIndex], height[rightIndex])
