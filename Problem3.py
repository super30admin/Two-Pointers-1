'''
Time Complexity: O(n)
Space COmplexity: O(1)
Run on Leetcode: YES
'''
class Solution:
    def maxArea(self, height: list[int]) -> int:
        low = 0
        high = len(height) - 1
        areaMax = 0
        while low < high:
            if height[low] < height[high]:
                areaMax = max(areaMax, height[low] * (high - low))
                low += 1
            else:
                areaMax = max(areaMax, height[high] * (high - low))
                high -= 1
        return areaMax