class Solution:
    def maxArea(self, height: List[int]) -> int:

        if height is None or len(height)==0:
            return 0

        low=0
        high=len(height)-1
        maxx=0
        while low <high:
            if height[low]<height[high]:
                maxx = max(maxx, height[low]*(high-low))
                low+=1
            else:
                maxx =  max(maxx, height[high]*(high-low))
                high-=1

        return  maxx
