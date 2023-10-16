#time=O(n) space=O(1)
class Solution:
    def maxArea(self, height: List[int]) -> int:
        i, j = 0, len(height)-1
        ma = 0
        
        while i < j:
            
            ma = max(ma, min(height[i], height[j]) * (j-i))
            if height[i] < height[j]:
                i += 1
            else:
                j -= 1
        
        return ma
