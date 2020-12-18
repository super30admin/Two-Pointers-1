# TC : O(n) ; n = length of array
# SC : O(1)
# Approach : We use two pointers, and calculate area between high and low pointers, if it is greater than
# current max area, we update Max, if height[low] < height[high], we increase low, in the hope of 
# finding bigger height, and vice-versa. We return Max in end.

class Solution:
    def maxArea(self, height: List[int]) -> int:
        if not height or len(height) == 0:
            return 0
        low = 0
        high = len(height) - 1
        Max = float('-inf')
        while low < high:
            Max = max(Max, min(height[low], height[high]) * (high - low))
            if height[low] < height[high]:
                low += 1
            else:
                high -= 1
        return Max