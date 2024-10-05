# time complexity: O(n)
# space complexity: O(1)

class Solution:
    def maxArea(self, height: List[int]) -> int:
        low = 0
        high = len(height)-1
        maxArea = 0

        while low<high:
            currArea = min(height[low], height[high]) * (high-low)
            maxArea = max(currArea, maxArea)

            if height[low]>height[high]:
                high -= 1
            else:
                low += 1

        return maxArea