"""
11. Container With Most Water
Time Complexity - O(n)
Space Complexity - O(1)
Using two pointer approach calculated capacity of container and returned max_value"""

class Solution:
    def maxArea(self, height: List[int]) -> int:
        low = 0
        high = len(height)-1
        max_val = float("-inf")
        while(low < high):
            max_val = max(max_val , min(height[low],height[high])*(high-low))
            if height[low] < height[high]:
                low += 1
            else:
                high -= 1
        return max_val
        