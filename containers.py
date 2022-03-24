#time complexity: o(n)
#space coplexity: o(1)
class Solution:
    def maxArea(self, h: List[int]) -> int:
        low=m=0
        high=len(h)-1
        while(low < high):
            m = max(m, min(h[low],h[high])*(high-low))
            if(h[low]<h[high]):
                low+=1
            else:
                high-=1
        return m
        
        
