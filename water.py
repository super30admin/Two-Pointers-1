class Solution:
    def maxArea(self, height: List[int]) -> int:
        low=0
        high=len(height)-1
        m=0
        
        
        while low<high:
            vol = min(height[low],height[high])*(high-low)
            m = max(m,vol)
            if height[low]<height[high]:
                low+=1
            else:
                high-=1
            
        return m
        