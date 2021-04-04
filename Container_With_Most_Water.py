class Solution:
    def maxArea(self, height: List[int]) -> int:
        if not height:
            return

        max_area = 0

        low = 0
        high = len(height) - 1

        while low < high:
            max_area = max(max_area, (high - low) * min(height[low], height[high]))
            if height[low] < height[high]:
                low += 1
            else:
                high -= 1

        return max_area
