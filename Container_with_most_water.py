'''
Time Complexity: O(n)
Space Complexity: O(1)
'''


class Solution:
    def maxArea(self, height: List[int]) -> int:
        max_water = 0
        n = len(height)
        low = 0
        high = n-1
        while(low < high):
            curr = (high-low) * (min(height[low], height[high]))
            max_water = max(max_water, curr)
            if height[low] <= height[high]:
                low += 1
            else:
                high -= 1
        return max_water
