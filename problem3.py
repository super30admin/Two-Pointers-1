# TC: O(n)
# SC: O(1)

class Solution:
    def maxArea(self, height: List[int]) -> int:
        low = 0
        high = len(height) - 1
        maximum = 0

        while low < high:
            area = (high - low) * min(height[low], height[high])
            if area > maximum:
                maximum = area
            if height[low] > height[high]:
                high -= 1
            else:
                low += 1
        return maximum