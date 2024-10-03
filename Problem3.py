# 11. Container With Most Water
class Solution:
    def maxArea(self, height: List[int]) -> int:
        n = len(height)
        low = 0
        high = n-1
        max_ = 0

        while(low < high):
            h = min(height[low],height[high])
            max_ = max(max_,h * (high-low))

            if height[low] < height[high]:
                low += 1
            elif height[low] > height[high]:
                high -= 1
            elif height[low] == height[high]: 
                low += 1
                high -= 1

        return max_



        