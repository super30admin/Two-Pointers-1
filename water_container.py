class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        
        if len(height)==0 :
            return 0
        
        high=len(height)-1
        low = 0
        mx = 0
        
        while low<high :
            
            mx = max(mx,min(height[low],height[high])*(high-low))
        
            if (height[low]<height[high]):
                low+=1
            else:
                high-=1
        return mx
#Time -- O(n)
#Space -- O(1)