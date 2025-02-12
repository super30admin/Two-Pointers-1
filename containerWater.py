"""
TP Approach
TC - O(n)
SC - O(1)
"""
class Solution:
    def maxArea(self, height: List[int]) -> int:
        if height is None or len(height) == 0: return 0

        n = len(height)
        low = 0
        high = n - 1
        maxWater = 0

        while low <= high:
            # calculate width between two indices
            width = high - low
            # get minHeight
            minHeight = min(height[low], height[high])
            # calculate maxWater
            maxWater = max(maxWater, (width * minHeight))

            if height[low] <= height[high]:
                low += 1
            else: high -= 1
        return maxWater