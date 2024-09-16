# Time complexity: O(N)
# Space complexity: O(1)
# Compiled on leetcode? Yes
# No difficulties faced
class Solution:
    def maxArea(self, height: List[int]) -> int:
        high = len(height) - 1
        low = 0
        maxAreaSoFar = 0 #Area cannot be negative
        while low < high:
            maxAreaSoFar = max(maxAreaSoFar, min(height[low], height[high]) * (high - low))
            if height[low] < height[high]:
                low+= 1
            else:
                high -= 1
        return maxAreaSoFar        