# Time Complexity: O(n) where n is the length of the array 
# Space Complexity:  O(1)
class Solution:
    def maxArea(self, height: List[int]) -> int:
        result = 0
        low = 0
        high = len(height) - 1
        while(low <= high):
            result = max(result,(high-low)*min(height[high],height[low]))
            if height[high] < height[low]:
                high -=1
            else:
                low += 1
        return result