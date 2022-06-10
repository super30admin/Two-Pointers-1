# Time Complexity: O(n)
# Space Complexity: O(1)
  
class Solution:
    def maxArea(self, height: List[int]) -> int:
        maxA = 0
        low = 0
        high = len(height) - 1
        
        while low < high:
            maxA = max(maxA, min(height[low], height[high])*(high-low))
            if height[low] < height[high]:
                low += 1
            else:
                high -= 1
        return maxA
