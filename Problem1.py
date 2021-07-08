class Solution:
    def maxArea(self, height: List[int]) -> int:
        if height == [] or len(height) == 0:
            return 0
        
        low = 0 
        n = len(height)
        high = n-1
        maxArea = 0
        
        while low<high:
            #calculate area
            print(low,high,height[low],height[high])
            currContainer = (high-low)*(min(height[low],height[high]))
            
            maxArea = max(maxArea,currContainer)
            
            if height[low]<height[high]:
                low +=1
            else:
                high -=1
        
        return maxArea
        
