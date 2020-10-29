class Solution:
    def maxArea(self, height: List[int]) -> int:
        low = 0
        high = len(height)-1
        maxarea=0
        
        while low<high:
            if height[low]<height[high]:
                maxarea = max(maxarea, height[low]*(high-low))
                low+=1
            else:
                maxarea = max(maxarea, height[high]*(high-low))
                high-=1
                
                
        return maxarea