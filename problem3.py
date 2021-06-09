class Solution:
    def maxArea(self, height: List[int]) -> int:
        vol = 0
        for i in range(len(height)-1):
            for j in range(1, len(height)):
                vol = max(vol, (min(height[i],height[j]) *(j-i) ))
        
        return vol
    
#time copmlexity is O(n^2)
#space complexity is O(1)